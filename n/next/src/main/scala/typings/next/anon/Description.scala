package typings.next.anon

import typings.next.distServerLibSquooshCodecsMod.RotateOptions
import typings.next.distServerLibSquooshImageDataMod.default
import typings.next.nextStrings.Rotate
import typings.next.nextStrings.`Rotate image`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  val defaultOptions: NumRotations
  
  val description: `Rotate image`
  
  def instantiate(): js.Promise[
    js.Function4[
      /* buffer */ js.typedarray.Uint8Array, 
      /* width */ Double, 
      /* height */ Double, 
      /* hasNumRotations */ RotateOptions, 
      js.Promise[default]
    ]
  ]
  
  val name: Rotate
}
object Description {
  
  inline def apply(
    defaultOptions: NumRotations,
    instantiate: () => js.Promise[
      js.Function4[
        /* buffer */ js.typedarray.Uint8Array, 
        /* width */ Double, 
        /* height */ Double, 
        /* hasNumRotations */ RotateOptions, 
        js.Promise[default]
      ]
    ]
  ): Description = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any], description = "Rotate image", instantiate = js.Any.fromFunction0(instantiate), name = "Rotate")
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDefaultOptions(value: NumRotations): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: `Rotate image`): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInstantiate(
      value: () => js.Promise[
          js.Function4[
            /* buffer */ js.typedarray.Uint8Array, 
            /* width */ Double, 
            /* height */ Double, 
            /* hasNumRotations */ RotateOptions, 
            js.Promise[default]
          ]
        ]
    ): Self = StObject.set(x, "instantiate", js.Any.fromFunction0(value))
    
    inline def setName(value: Rotate): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
