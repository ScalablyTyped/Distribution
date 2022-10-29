package typings.postcssMergeLonghand

import typings.postcss.libDeclarationMod.DeclarationRaws
import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Explode extends StObject {
    
    def explode(rule: Rule_): Unit
    
    def merge(rule: Rule_): Unit
  }
  object Explode {
    
    inline def apply(explode: Rule_ => Unit, merge: Rule_ => Unit): Explode = {
      val __obj = js.Dynamic.literal(explode = js.Any.fromFunction1(explode), merge = js.Any.fromFunction1(merge))
      __obj.asInstanceOf[Explode]
    }
    
    extension [Self <: Explode](x: Self) {
      
      inline def setExplode(value: Rule_ => Unit): Self = StObject.set(x, "explode", js.Any.fromFunction1(value))
      
      inline def setMerge(value: Rule_ => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<postcss.postcss.DeclarationProps> */
  trait PartialDeclarationProps extends StObject {
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var prop: js.UndefOr[String] = js.undefined
    
    var raws: js.UndefOr[DeclarationRaws] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object PartialDeclarationProps {
    
    inline def apply(): PartialDeclarationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDeclarationProps]
    }
    
    extension [Self <: PartialDeclarationProps](x: Self) {
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setRaws(value: DeclarationRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Typeofborders extends StObject {
    
    def explode(rule: Rule_): Unit
    
    def merge(rule: Rule_): Unit
  }
  object Typeofborders {
    
    inline def apply(explode: Rule_ => Unit, merge: Rule_ => Unit): Typeofborders = {
      val __obj = js.Dynamic.literal(explode = js.Any.fromFunction1(explode), merge = js.Any.fromFunction1(merge))
      __obj.asInstanceOf[Typeofborders]
    }
    
    extension [Self <: Typeofborders](x: Self) {
      
      inline def setExplode(value: Rule_ => Unit): Self = StObject.set(x, "explode", js.Any.fromFunction1(value))
      
      inline def setMerge(value: Rule_ => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    }
  }
}
