package typings.mdastBuilder

import typings.mdastBuilder.mdastBuilderStrings.center
import typings.mdastBuilder.mdastBuilderStrings.left
import typings.mdastBuilder.mdastBuilderStrings.right
import typings.unist.mod.Node
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: js.UndefOr[js.Array[left | right | center | Null]] = js.undefined
    
    var children: js.Array[Node[typings.unist.mod.Data]]
    
    var data: js.UndefOr[typings.unist.mod.Data] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: String
  }
  object Align {
    
    inline def apply(children: js.Array[Node[typings.unist.mod.Data]], `type`: String): Align = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: js.Array[left | right | center | Null]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAlignVarargs(value: (left | right | center | Null)*): Self = StObject.set(x, "align", js.Array(value*))
      
      inline def setChildren(value: js.Array[Node[typings.unist.mod.Data]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node[typings.unist.mod.Data]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: typings.unist.mod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Alt extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var children: js.Array[Node[typings.unist.mod.Data]]
    
    var data: js.UndefOr[typings.unist.mod.Data] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var url: String
  }
  object Alt {
    
    inline def apply(children: js.Array[Node[typings.unist.mod.Data]], `type`: String, url: String): Alt = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setChildren(value: js.Array[Node[typings.unist.mod.Data]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node[typings.unist.mod.Data]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: typings.unist.mod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.Array[Node[typings.unist.mod.Data]]
    
    var data: js.UndefOr[typings.unist.mod.Data] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var title: String
    
    var `type`: String
    
    var url: String
  }
  object Children {
    
    inline def apply(children: js.Array[Node[typings.unist.mod.Data]], title: String, `type`: String, url: String): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Node[typings.unist.mod.Data]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node[typings.unist.mod.Data]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: typings.unist.mod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.UndefOr[typings.unist.mod.Data] = js.undefined
    
    var lang: String
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: String
  }
  object Data {
    
    inline def apply(lang: String, `type`: String): Data = {
      val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: typings.unist.mod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
