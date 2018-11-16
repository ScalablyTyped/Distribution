package typings
package plistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plistMod {
  type PlistBuildOptions = xmlbuilderLib.xmlbuilderMod.xmlbuilderNs.XMLToStringOptions
  type PlistValue = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | nodeLib.Buffer | PlistObject | PlistArray
}
