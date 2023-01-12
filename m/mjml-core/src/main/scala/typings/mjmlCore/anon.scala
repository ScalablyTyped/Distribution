package typings.mjmlCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mjmlCore.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var props: js.UndefOr[Children] = js.undefined
    
    var rawXML: js.UndefOr[Boolean] = js.undefined
    
    var renderer: js.UndefOr[js.Function1[/* component */ Component, Any]] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setProps(value: Children): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRawXML(value: Boolean): Self = StObject.set(x, "rawXML", value.asInstanceOf[js.Any])
      
      inline def setRawXMLUndefined: Self = StObject.set(x, "rawXML", js.undefined)
      
      inline def setRenderer(value: /* component */ Component => Any): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  trait Borders extends StObject {
    
    var borders: Double
    
    var box: Double
    
    var paddings: Double
    
    var totalWidth: Double
  }
  object Borders {
    
    inline def apply(borders: Double, box: Double, paddings: Double, totalWidth: Double): Borders = {
      val __obj = js.Dynamic.literal(borders = borders.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any], totalWidth = totalWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Borders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
      
      inline def setBorders(value: Double): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
      
      inline def setBox(value: Double): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setPaddings(value: Double): Self = StObject.set(x, "paddings", value.asInstanceOf[js.Any])
      
      inline def setTotalWidth(value: Double): Self = StObject.set(x, "totalWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: Any
    
    /** is first child */
    var first: Boolean
    
    var index: Double
    
    /** is last child */
    var last: Boolean
    
    var nonRawSiblings: Double
    
    /** number of sibling elements */
    var sibling: Double
  }
  object Children {
    
    inline def apply(
      children: Any,
      first: Boolean,
      index: Double,
      last: Boolean,
      nonRawSiblings: Double,
      sibling: Double
    ): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], nonRawSiblings = nonRawSiblings.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setNonRawSiblings(value: Double): Self = StObject.set(x, "nonRawSiblings", value.asInstanceOf[js.Any])
      
      inline def setSibling(value: Double): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: String
    
    var start: String
  }
  object End {
    
    inline def apply(end: String, start: String): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofComponent
    extends StObject
       with Instantiable1[/* initialData */ Any, Component] {
    
    var defaultAttributes: StringDictionary[js.UndefOr[String]] = js.native
    
    def getTagName(): Any = js.native
    
    def isRawElement(): Boolean = js.native
  }
}
