package typings.plist

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Date
import typings.std.ReadonlyArray
import typings.xmlbuilder.mod.XMLToStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("plist", "build")
  @js.native
  def build(obj: PlistValue): String = js.native
  @JSImport("plist", "build")
  @js.native
  def build(obj: PlistValue, opts: PlistBuildOptions): String = js.native
  
  @JSImport("plist", "parse")
  @js.native
  def parse(xml: String): PlistValue = js.native
  
  @js.native
  trait PlistArray
    extends ReadonlyArray[PlistValue]
       with _PlistValue
  
  type PlistBuildOptions = XMLToStringOptions
  
  @js.native
  trait PlistObject
    extends /* x */ StringDictionary[PlistValue]
       with _PlistValue
  object PlistObject {
    
    @scala.inline
    def apply(): PlistObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlistObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.node.Buffer
    - typings.plist.mod.PlistObject
    - typings.plist.mod.PlistArray
  */
  type PlistValue = _PlistValue | String | Double | Boolean | Date | Buffer
  
  trait _PlistValue extends StObject
}
