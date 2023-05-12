package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTypesLayerCompTypesMod {
  
  trait LayerCompCreateOptions extends StObject {
    
    /**
      * Record the state of the layers' effects.
      * @default false
      * @minVersion 24.0
      */
    var appearance: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Record the state of any Layer Comps contained in the recorded layers' Smart Objects.
      * @default false
      * @minVersion 24.0
      */
    var childComp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment appears in the Layer Comp Options dialog.
      * @default null
      * @minVersion 24.0
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * The name shown in the Layer Comps panel. If no value is provided,
      * then a name will be generated following the template, "Layer Comp #".
      * @default -
      * @minVersion 24.0
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Record the state of the layers' position.
      * @default true
      * @minVersion 24.0
      */
    var position: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Record the state of the layers' visibility.
      * @default false
      * @minVersion 24.0
      */
    var visibility: js.UndefOr[Boolean] = js.undefined
  }
  object LayerCompCreateOptions {
    
    inline def apply(): LayerCompCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerCompCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerCompCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setAppearance(value: Boolean): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setChildComp(value: Boolean): Self = StObject.set(x, "childComp", value.asInstanceOf[js.Any])
      
      inline def setChildCompUndefined: Self = StObject.set(x, "childComp", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  trait LayerCompRecaptureOptions extends StObject {
    
    /**
      * Update the recorded state of the layers' effects.
      * @default false
      * @minVersion 24.0
      */
    var appearance: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update the recorded state of any Layer Comps contained in the recorded layers' Smart Objects.
      * @default false
      * @minVersion 24.0
      */
    var childComp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update the recorded state of the layers' position.
      * @default false
      * @minVersion 24.0
      */
    var position: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update the recorded state of the layers' visibility.
      * @default false
      * @minVersion 24.0
      */
    var visibility: js.UndefOr[Boolean] = js.undefined
  }
  object LayerCompRecaptureOptions {
    
    inline def apply(): LayerCompRecaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerCompRecaptureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerCompRecaptureOptions] (val x: Self) extends AnyVal {
      
      inline def setAppearance(value: Boolean): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setChildComp(value: Boolean): Self = StObject.set(x, "childComp", value.asInstanceOf[js.Any])
      
      inline def setChildCompUndefined: Self = StObject.set(x, "childComp", js.undefined)
      
      inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
}
