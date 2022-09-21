package typings.nightwatch.mod

import typings.nightwatch.anon.DateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchScreenshotOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  def filename_format(): String = js.native
  def filename_format(hasTestSuiteTestCaseIsErrorDateObject: DateObject): String = js.native
  
  var on_error: js.UndefOr[Boolean] = js.native
  
  var on_failure: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
}
