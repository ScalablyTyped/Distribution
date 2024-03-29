package typings.pixiUtils

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object Base {
    
    inline def apply(): Base = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: ImageData | Null
    
    var height: Double
    
    var width: Double
  }
  object Data {
    
    inline def apply(height: Double, width: Double): Data = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: ImageData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length[L /* <: Double */] extends StObject {
    
    var length: L
  }
  object Length {
    
    inline def apply[L /* <: Double */](length: L): Length[L] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length[L]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length[?], L /* <: Double */] (val x: Self & Length[L]) extends AnyVal {
      
      inline def setLength(value: L): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
