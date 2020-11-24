package typings.plist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type PlistBuildOptions = typings.xmlbuilder.mod.XMLToStringOptions
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.std.Date
    - typings.node.Buffer
    - typings.plist.mod.PlistObject
    - typings.plist.mod.PlistArray
  */
  type PlistValue = typings.plist.mod._PlistValue | java.lang.String | scala.Double | scala.Boolean | typings.std.Date | typings.node.Buffer
}
