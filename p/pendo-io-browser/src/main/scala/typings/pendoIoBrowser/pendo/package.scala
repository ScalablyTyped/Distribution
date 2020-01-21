package typings.pendoIoBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pendo {
  type Account = typings.pendoIoBrowser.AnonIdString with typings.pendoIoBrowser.pendo.Metadata
  type Events = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in 'ready' | 'guidesLoaded' | 'guidesFailed' ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias pendo-io-browser.pendo.Events * / object}
    */ typings.pendoIoBrowser.pendoIoBrowserStrings.Events with typings.pendoIoBrowser.pendo.EventCallbacks
  type Metadata = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | scala.Double | scala.Boolean | typings.std.Date | (js.Array[scala.Double | java.lang.String])
  ]
  type Visitor = typings.pendoIoBrowser.AnonId with typings.pendoIoBrowser.pendo.Metadata
}
