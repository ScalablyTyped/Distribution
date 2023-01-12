package typings.pixiAssets

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDetectionsMod {
  
  @JSImport("@pixi/assets/lib/detections", "detectAvif")
  @js.native
  val detectAvif: FormatDetectionParser = js.native
  
  @JSImport("@pixi/assets/lib/detections", "detectDefaults")
  @js.native
  val detectDefaults: FormatDetectionParser = js.native
  
  @JSImport("@pixi/assets/lib/detections", "detectWebp")
  @js.native
  val detectWebp: FormatDetectionParser = js.native
  
  trait FormatDetectionParser extends StObject {
    
    /**
      * Add formats (file extensions) to the existing list of formats.
      * Return an new array with added formats, do not mutate the formats argument.
      * @returns {Promise<string[]>} - Promise that resolves to the new formats array.
      */
    def add(formats: js.Array[String]): js.Promise[js.Array[String]]
    
    /** Should be ExtensionType.DetectionParser */
    var `extension`: js.UndefOr[ExtensionMetadata] = js.undefined
    
    /**
      * Remove formats (file extensions) from the list of supported formats.
      * This is used when uninstalling this DetectionParser.
      * Return an new array with filtered formats, do not mutate the formats argument.
      * @returns {Promise<string[]>} - Promise that resolves to the new formats array.
      */
    def remove(formats: js.Array[String]): js.Promise[js.Array[String]]
    
    /** Browser/platform feature detection supported if return true  */
    def test(): js.Promise[Boolean]
  }
  object FormatDetectionParser {
    
    inline def apply(
      add: js.Array[String] => js.Promise[js.Array[String]],
      remove: js.Array[String] => js.Promise[js.Array[String]],
      test: () => js.Promise[Boolean]
    ): FormatDetectionParser = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove), test = js.Any.fromFunction0(test))
      __obj.asInstanceOf[FormatDetectionParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatDetectionParser] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[String] => js.Promise[js.Array[String]]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setExtension(value: ExtensionMetadata): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setRemove(value: js.Array[String] => js.Promise[js.Array[String]]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setTest(value: () => js.Promise[Boolean]): Self = StObject.set(x, "test", js.Any.fromFunction0(value))
    }
  }
}
