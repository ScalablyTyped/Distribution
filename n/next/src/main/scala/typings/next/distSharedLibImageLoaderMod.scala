package typings.next

import typings.next.distSharedLibImageConfigMod.ImageLoaderPropsWithConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibImageLoaderMod {
  
  object default {
    
    inline def apply(param0: ImageLoaderPropsWithConfig): String = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("next/dist/shared/lib/image-loader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/shared/lib/image-loader", "default.__next_img_default")
    @js.native
    def nextImgDefault: Boolean = js.native
    
    inline def nextImgDefault_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__next_img_default")(x.asInstanceOf[js.Any])
  }
}
