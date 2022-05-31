package typings.plist

import typings.plist.mod.PlistBuildOptions
import typings.plist.mod.PlistValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object plist {
    
    @JSGlobal("plist")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(obj: PlistValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def build(obj: PlistValue, opts: PlistBuildOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parse(xml: String): PlistValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[PlistValue]
  }
}
