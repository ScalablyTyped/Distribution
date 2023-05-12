package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.libUtilContainerFlowMod.FlowContent
import typings.mdastUtilToMarkdown.libUtilContainerPhrasingMod.PhrasingContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var children: js.Array[FlowContent]
  }
  object `0` {
    
    inline def apply(children: js.Array[FlowContent]): `0` = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[FlowContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: FlowContent*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait `1` extends StObject {
    
    var children: js.Array[PhrasingContent]
  }
  object `1` {
    
    inline def apply(children: js.Array[PhrasingContent]): `1` = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait Children extends StObject {
    
    var children: js.Array[typings.mdastUtilToMarkdown.libTypesMod.PhrasingContent]
  }
  object Children {
    
    inline def apply(children: js.Array[typings.mdastUtilToMarkdown.libTypesMod.PhrasingContent]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[typings.mdastUtilToMarkdown.libTypesMod.PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: typings.mdastUtilToMarkdown.libTypesMod.PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ChildrenArray extends StObject {
    
    var children: js.Array[typings.mdastUtilToMarkdown.libTypesMod.FlowContent]
  }
  object ChildrenArray {
    
    inline def apply(children: js.Array[typings.mdastUtilToMarkdown.libTypesMod.FlowContent]): ChildrenArray = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildrenArray] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[typings.mdastUtilToMarkdown.libTypesMod.FlowContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: typings.mdastUtilToMarkdown.libTypesMod.FlowContent*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
}
