package typings.parseley

import typings.parseley.parseleyStrings.$Equalssign
import typings.parseley.parseleyStrings.AsteriskEqualssign
import typings.parseley.parseleyStrings.Equalssign
import typings.parseley.parseleyStrings.Greaterthansign
import typings.parseley.parseleyStrings.Plussign
import typings.parseley.parseleyStrings.Space
import typings.parseley.parseleyStrings.Tilde
import typings.parseley.parseleyStrings.TildeEqualssign
import typings.parseley.parseleyStrings.VerticallineEqualssign
import typings.parseley.parseleyStrings.VerticallineVerticalline
import typings.parseley.parseleyStrings.`^Equalssign`
import typings.parseley.parseleyStrings.`class`
import typings.parseley.parseleyStrings.attrPresence
import typings.parseley.parseleyStrings.attrValue
import typings.parseley.parseleyStrings.combinator
import typings.parseley.parseleyStrings.compound
import typings.parseley.parseleyStrings.i
import typings.parseley.parseleyStrings.id
import typings.parseley.parseleyStrings.list
import typings.parseley.parseleyStrings.s
import typings.parseley.parseleyStrings.tag
import typings.parseley.parseleyStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object astMod {
  
  trait AttributePresenceSelector
    extends StObject
       with SimpleSelector {
    
    var name: String
    
    var namespace: String | Null
    
    var specificity: Specificity
    
    var `type`: attrPresence
  }
  object AttributePresenceSelector {
    
    inline def apply(name: String, specificity: Specificity): AttributePresenceSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("attrPresence")
      __obj.asInstanceOf[AttributePresenceSelector]
    }
    
    extension [Self <: AttributePresenceSelector](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: attrPresence): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributeValueSelector
    extends StObject
       with SimpleSelector {
    
    var matcher: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign
    
    var modifier: i | s | Null
    
    var name: String
    
    var namespace: String | Null
    
    var specificity: Specificity
    
    var `type`: attrValue
    
    var value: String
  }
  object AttributeValueSelector {
    
    inline def apply(
      matcher: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign,
      name: String,
      specificity: Specificity,
      value: String
    ): AttributeValueSelector = {
      val __obj = js.Dynamic.literal(matcher = matcher.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], modifier = null, namespace = null)
      __obj.updateDynamic("type")("attrValue")
      __obj.asInstanceOf[AttributeValueSelector]
    }
    
    extension [Self <: AttributeValueSelector](x: Self) {
      
      inline def setMatcher(
        value: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign
      ): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
      
      inline def setModifier(value: i | s): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierNull: Self = StObject.set(x, "modifier", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: attrValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassSelector
    extends StObject
       with SimpleSelector {
    
    var name: String
    
    var specificity: Specificity
    
    var `type`: `class`
  }
  object ClassSelector {
    
    inline def apply(name: String, specificity: Specificity): ClassSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("class")
      __obj.asInstanceOf[ClassSelector]
    }
    
    extension [Self <: ClassSelector](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Combinator
    extends StObject
       with SimpleSelector {
    
    var combinator: Space | Plussign | Greaterthansign | Tilde | VerticallineVerticalline
    
    var left: CompoundSelector
    
    var specificity: Specificity
    
    var `type`: combinator
  }
  object Combinator {
    
    inline def apply(
      combinator: Space | Plussign | Greaterthansign | Tilde | VerticallineVerticalline,
      left: CompoundSelector,
      specificity: Specificity
    ): Combinator = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("combinator")
      __obj.asInstanceOf[Combinator]
    }
    
    extension [Self <: Combinator](x: Self) {
      
      inline def setCombinator(value: Space | Plussign | Greaterthansign | Tilde | VerticallineVerticalline): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: CompoundSelector): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: combinator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompoundSelector
    extends StObject
       with Selector {
    
    var list: js.Array[SimpleSelector]
    
    var specificity: Specificity
    
    var `type`: compound
  }
  object CompoundSelector {
    
    inline def apply(list: js.Array[SimpleSelector], specificity: Specificity): CompoundSelector = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("compound")
      __obj.asInstanceOf[CompoundSelector]
    }
    
    extension [Self <: CompoundSelector](x: Self) {
      
      inline def setList(value: js.Array[SimpleSelector]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: SimpleSelector*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: compound): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdSelector
    extends StObject
       with SimpleSelector {
    
    var name: String
    
    var specificity: Specificity
    
    var `type`: id
  }
  object IdSelector {
    
    inline def apply(name: String, specificity: Specificity): IdSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("id")
      __obj.asInstanceOf[IdSelector]
    }
    
    extension [Self <: IdSelector](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: id): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListSelector
    extends StObject
       with Selector {
    
    var list: js.Array[CompoundSelector]
    
    var `type`: list
  }
  object ListSelector {
    
    inline def apply(list: js.Array[CompoundSelector]): ListSelector = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[ListSelector]
    }
    
    extension [Self <: ListSelector](x: Self) {
      
      inline def setList(value: js.Array[CompoundSelector]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: CompoundSelector*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parseley.astMod.ListSelector
    - typings.parseley.astMod.CompoundSelector
    - typings.parseley.astMod.SimpleSelector
  */
  trait Selector extends StObject
  object Selector {
    
    inline def AttributePresenceSelector(name: String, specificity: Specificity): typings.parseley.astMod.AttributePresenceSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("attrPresence")
      __obj.asInstanceOf[typings.parseley.astMod.AttributePresenceSelector]
    }
    
    inline def AttributeValueSelector(
      matcher: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign,
      name: String,
      specificity: Specificity,
      value: String
    ): typings.parseley.astMod.AttributeValueSelector = {
      val __obj = js.Dynamic.literal(matcher = matcher.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], modifier = null, namespace = null)
      __obj.updateDynamic("type")("attrValue")
      __obj.asInstanceOf[typings.parseley.astMod.AttributeValueSelector]
    }
    
    inline def ClassSelector(name: String, specificity: Specificity): typings.parseley.astMod.ClassSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("class")
      __obj.asInstanceOf[typings.parseley.astMod.ClassSelector]
    }
    
    inline def Combinator(
      combinator: Space | Plussign | Greaterthansign | Tilde | VerticallineVerticalline,
      left: CompoundSelector,
      specificity: Specificity
    ): typings.parseley.astMod.Combinator = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("combinator")
      __obj.asInstanceOf[typings.parseley.astMod.Combinator]
    }
    
    inline def CompoundSelector(list: js.Array[SimpleSelector], specificity: Specificity): typings.parseley.astMod.CompoundSelector = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("compound")
      __obj.asInstanceOf[typings.parseley.astMod.CompoundSelector]
    }
    
    inline def IdSelector(name: String, specificity: Specificity): typings.parseley.astMod.IdSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("id")
      __obj.asInstanceOf[typings.parseley.astMod.IdSelector]
    }
    
    inline def ListSelector(list: js.Array[CompoundSelector]): typings.parseley.astMod.ListSelector = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("list")
      __obj.asInstanceOf[typings.parseley.astMod.ListSelector]
    }
    
    inline def TagSelector(name: String, specificity: Specificity): typings.parseley.astMod.TagSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("tag")
      __obj.asInstanceOf[typings.parseley.astMod.TagSelector]
    }
    
    inline def UniversalSelector(specificity: Specificity): typings.parseley.astMod.UniversalSelector = {
      val __obj = js.Dynamic.literal(specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("universal")
      __obj.asInstanceOf[typings.parseley.astMod.UniversalSelector]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parseley.astMod.UniversalSelector
    - typings.parseley.astMod.TagSelector
    - typings.parseley.astMod.ClassSelector
    - typings.parseley.astMod.IdSelector
    - typings.parseley.astMod.AttributePresenceSelector
    - typings.parseley.astMod.AttributeValueSelector
    - typings.parseley.astMod.Combinator
  */
  trait SimpleSelector
    extends StObject
       with Selector
  object SimpleSelector {
    
    inline def AttributePresenceSelector(name: String, specificity: Specificity): typings.parseley.astMod.AttributePresenceSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("attrPresence")
      __obj.asInstanceOf[typings.parseley.astMod.AttributePresenceSelector]
    }
    
    inline def AttributeValueSelector(
      matcher: Equalssign | TildeEqualssign | VerticallineEqualssign | `^Equalssign` | $Equalssign | AsteriskEqualssign,
      name: String,
      specificity: Specificity,
      value: String
    ): typings.parseley.astMod.AttributeValueSelector = {
      val __obj = js.Dynamic.literal(matcher = matcher.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], modifier = null, namespace = null)
      __obj.updateDynamic("type")("attrValue")
      __obj.asInstanceOf[typings.parseley.astMod.AttributeValueSelector]
    }
    
    inline def ClassSelector(name: String, specificity: Specificity): typings.parseley.astMod.ClassSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("class")
      __obj.asInstanceOf[typings.parseley.astMod.ClassSelector]
    }
    
    inline def Combinator(
      combinator: Space | Plussign | Greaterthansign | Tilde | VerticallineVerticalline,
      left: CompoundSelector,
      specificity: Specificity
    ): typings.parseley.astMod.Combinator = {
      val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("combinator")
      __obj.asInstanceOf[typings.parseley.astMod.Combinator]
    }
    
    inline def IdSelector(name: String, specificity: Specificity): typings.parseley.astMod.IdSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("id")
      __obj.asInstanceOf[typings.parseley.astMod.IdSelector]
    }
    
    inline def TagSelector(name: String, specificity: Specificity): typings.parseley.astMod.TagSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("tag")
      __obj.asInstanceOf[typings.parseley.astMod.TagSelector]
    }
    
    inline def UniversalSelector(specificity: Specificity): typings.parseley.astMod.UniversalSelector = {
      val __obj = js.Dynamic.literal(specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("universal")
      __obj.asInstanceOf[typings.parseley.astMod.UniversalSelector]
    }
  }
  
  type Specificity = js.Tuple3[Double, Double, Double]
  
  trait TagSelector
    extends StObject
       with SimpleSelector {
    
    var name: String
    
    var namespace: String | Null
    
    var specificity: Specificity
    
    var `type`: tag
  }
  object TagSelector {
    
    inline def apply(name: String, specificity: Specificity): TagSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("tag")
      __obj.asInstanceOf[TagSelector]
    }
    
    extension [Self <: TagSelector](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UniversalSelector
    extends StObject
       with SimpleSelector {
    
    var namespace: String | Null
    
    var specificity: Specificity
    
    var `type`: universal
  }
  object UniversalSelector {
    
    inline def apply(specificity: Specificity): UniversalSelector = {
      val __obj = js.Dynamic.literal(specificity = specificity.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("type")("universal")
      __obj.asInstanceOf[UniversalSelector]
    }
    
    extension [Self <: UniversalSelector](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setSpecificity(value: Specificity): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setType(value: universal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
