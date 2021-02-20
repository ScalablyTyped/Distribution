package typings.mpvScript

import typings.mpvScript.mpvScriptStrings.down
import typings.mpvScript.mpvScriptStrings.press
import typings.mpvScript.mpvScriptStrings.repeat
import typings.mpvScript.mpvScriptStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mp {
  
  @js.native
  trait AddKeyBindingFlags extends StObject {
    
    var complex: js.UndefOr[Boolean] = js.native
    
    var event: js.UndefOr[down | repeat | up | press] = js.native
    
    var is_mouse: js.UndefOr[Boolean] = js.native
    
    var key_name: js.UndefOr[String] = js.native
    
    var key_text: js.UndefOr[String] = js.native
    
    var repeatable: js.UndefOr[Boolean] = js.native
  }
  object AddKeyBindingFlags {
    
    @scala.inline
    def apply(): AddKeyBindingFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddKeyBindingFlags]
    }
    
    @scala.inline
    implicit class AddKeyBindingFlagsMutableBuilder[Self <: AddKeyBindingFlags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplex(value: Boolean): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
      
      @scala.inline
      def setEvent(value: down | repeat | up | press): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setIs_mouse(value: Boolean): Self = StObject.set(x, "is_mouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_mouseUndefined: Self = StObject.set(x, "is_mouse", js.undefined)
      
      @scala.inline
      def setKey_name(value: String): Self = StObject.set(x, "key_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey_nameUndefined: Self = StObject.set(x, "key_name", js.undefined)
      
      @scala.inline
      def setKey_text(value: String): Self = StObject.set(x, "key_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey_textUndefined: Self = StObject.set(x, "key_text", js.undefined)
      
      @scala.inline
      def setRepeatable(value: Boolean): Self = StObject.set(x, "repeatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatableUndefined: Self = StObject.set(x, "repeatable", js.undefined)
    }
  }
  
  @js.native
  trait FileInfo extends StObject {
    
    var atime: Double = js.native
    
    var ctime: Double = js.native
    
    var is_dir: Boolean = js.native
    
    var is_file: Boolean = js.native
    
    var mode: Double = js.native
    
    var mtime: Double = js.native
    
    var size: Double = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(
      atime: Double,
      ctime: Double,
      is_dir: Boolean,
      is_file: Boolean,
      mode: Double,
      mtime: Double,
      size: Double
    ): FileInfo = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], is_dir = is_dir.asInstanceOf[js.Any], is_file = is_file.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Double): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_dir(value: Boolean): Self = StObject.set(x, "is_dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_file(value: Boolean): Self = StObject.set(x, "is_file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mpvScript.mpvScriptStrings.fatal
    - typings.mpvScript.mpvScriptStrings.error
    - typings.mpvScript.mpvScriptStrings.warn
    - typings.mpvScript.mpvScriptStrings.info
    - typings.mpvScript.mpvScriptStrings.v
    - typings.mpvScript.mpvScriptStrings.debug
    - typings.mpvScript.mpvScriptStrings.trace
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def debug: typings.mpvScript.mpvScriptStrings.debug = "debug".asInstanceOf[typings.mpvScript.mpvScriptStrings.debug]
    
    @scala.inline
    def error: typings.mpvScript.mpvScriptStrings.error = "error".asInstanceOf[typings.mpvScript.mpvScriptStrings.error]
    
    @scala.inline
    def fatal: typings.mpvScript.mpvScriptStrings.fatal = "fatal".asInstanceOf[typings.mpvScript.mpvScriptStrings.fatal]
    
    @scala.inline
    def info: typings.mpvScript.mpvScriptStrings.info = "info".asInstanceOf[typings.mpvScript.mpvScriptStrings.info]
    
    @scala.inline
    def trace: typings.mpvScript.mpvScriptStrings.trace = "trace".asInstanceOf[typings.mpvScript.mpvScriptStrings.trace]
    
    @scala.inline
    def v: typings.mpvScript.mpvScriptStrings.v = "v".asInstanceOf[typings.mpvScript.mpvScriptStrings.v]
    
    @scala.inline
    def warn: typings.mpvScript.mpvScriptStrings.warn = "warn".asInstanceOf[typings.mpvScript.mpvScriptStrings.warn]
  }
  
  @js.native
  trait OSDOverlay extends StObject {
    
    var data: String = js.native
    
    def remove(): Unit = js.native
    
    var res_x: Double = js.native
    
    var res_y: Double = js.native
    
    def update(): Unit = js.native
    
    var z: Double = js.native
  }
  object OSDOverlay {
    
    @scala.inline
    def apply(data: String, remove: () => Unit, res_x: Double, res_y: Double, update: () => Unit, z: Double): OSDOverlay = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), res_x = res_x.asInstanceOf[js.Any], res_y = res_y.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[OSDOverlay]
    }
    
    @scala.inline
    implicit class OSDOverlayMutableBuilder[Self <: OSDOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRes_x(value: Double): Self = StObject.set(x, "res_x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes_y(value: Double): Self = StObject.set(x, "res_y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OSDSize extends StObject {
    
    var aspect: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object OSDSize {
    
    @scala.inline
    def apply(): OSDSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OSDSize]
    }
    
    @scala.inline
    implicit class OSDSizeMutableBuilder[Self <: OSDSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
