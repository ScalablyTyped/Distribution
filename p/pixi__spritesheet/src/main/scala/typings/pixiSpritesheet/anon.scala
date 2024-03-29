package typings.pixiSpritesheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait H extends StObject {
    
    var h: Double
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object H {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: String
    
    var related_multi_packs: js.UndefOr[js.Array[String]] = js.undefined
    
    var scale: String
  }
  object Image {
    
    inline def apply(image: String, scale: String): Image = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setRelated_multi_packs(value: js.Array[String]): Self = StObject.set(x, "related_multi_packs", value.asInstanceOf[js.Any])
      
      inline def setRelated_multi_packsUndefined: Self = StObject.set(x, "related_multi_packs", js.undefined)
      
      inline def setRelated_multi_packsVarargs(value: String*): Self = StObject.set(x, "related_multi_packs", js.Array(value*))
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Relatedmultipacks extends StObject {
    
    var related_multi_packs: js.UndefOr[js.Array[String]] = js.undefined
    
    var scale: String
  }
  object Relatedmultipacks {
    
    inline def apply(scale: String): Relatedmultipacks = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Relatedmultipacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Relatedmultipacks] (val x: Self) extends AnyVal {
      
      inline def setRelated_multi_packs(value: js.Array[String]): Self = StObject.set(x, "related_multi_packs", value.asInstanceOf[js.Any])
      
      inline def setRelated_multi_packsUndefined: Self = StObject.set(x, "related_multi_packs", js.undefined)
      
      inline def setRelated_multi_packsVarargs(value: String*): Self = StObject.set(x, "related_multi_packs", js.Array(value*))
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait W extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object W {
    
    inline def apply(h: Double, w: Double): W = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[W]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: W] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
