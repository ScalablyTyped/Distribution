package typings
package pendoDashIoDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pendoNs {
  type Events = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in 'ready' | 'guidesLoaded' | 'guidesFailed' ]: -? (callback : pendo-io-browser.pendo.EventCallbacks[K]): object}
    */ pendoDashIoDashBrowserLib.pendoDashIoDashBrowserLibStrings.Events with EventCallbacks
  type Metadata = stdLib.Record[java.lang.String, js.UndefOr[java.lang.String | scala.Double]]
}
