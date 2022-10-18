package typings.next.anon

import typings.next.distServerLibSquooshCodecsMod.ResizeOptions
import typings.next.distServerLibSquooshImageDataMod.default
import typings.next.nextStrings.Resize
import typings.next.nextStrings.`Resize the image before compressing`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions extends StObject {
  
  val defaultOptions: FitMethod
  
  val description: `Resize the image before compressing`
  
  def instantiate(): js.Promise[
    js.Function4[
      /* buffer */ js.typedarray.Uint8Array, 
      /* input_width */ Double, 
      /* input_height */ Double, 
      /* hasWidthHeightMethodPremultiplyLinearRGB */ ResizeOptions, 
      default
    ]
  ]
  
  val name: Resize
}
object DefaultOptions {
  
  inline def apply(
    defaultOptions: FitMethod,
    instantiate: () => js.Promise[
      js.Function4[
        /* buffer */ js.typedarray.Uint8Array, 
        /* input_width */ Double, 
        /* input_height */ Double, 
        /* hasWidthHeightMethodPremultiplyLinearRGB */ ResizeOptions, 
        default
      ]
    ]
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], description = "Resize the image before compressing", instantiate = js.Any.fromFunction0(instantiate), name = "Resize")
    __obj.asInstanceOf[DefaultOptions]
  }
  
  extension [Self <: DefaultOptions](x: Self) {
    
    inline def setDefaultOptions(value: FitMethod): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: `Resize the image before compressing`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInstantiate(
      value: () => js.Promise[
          js.Function4[
            /* buffer */ js.typedarray.Uint8Array, 
            /* input_width */ Double, 
            /* input_height */ Double, 
            /* hasWidthHeightMethodPremultiplyLinearRGB */ ResizeOptions, 
            default
          ]
        ]
    ): Self = StObject.set(x, "instantiate", js.Any.fromFunction0(value))
    
    inline def setName(value: Resize): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
