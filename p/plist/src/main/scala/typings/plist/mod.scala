package typings.plist

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.xmlbuilder.mod.XMLToStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("plist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def build(obj: PlistValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def build(obj: PlistValue, opts: PlistBuildOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parse(xml: String): PlistValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(xml.asInstanceOf[js.Any]).asInstanceOf[PlistValue]
  
  type PlistArray = js.Array[PlistValue]
  
  type PlistBuildOptions = XMLToStringOptions
  
  trait PlistObject
    extends StObject
       with /* x */ StringDictionary[PlistValue]
  object PlistObject {
    
    inline def apply(): PlistObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlistObject]
    }
  }
  
  type PlistValue = String | Double | Boolean | js.Date | Buffer | PlistObject | Any
}
