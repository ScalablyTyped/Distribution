package typings.mocha.global

import org.scalablytyped.runtime.TopLevel
import typings.mocha.BrowserMocha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion Reporter augmentations
// #region Browser augmentations
/**
  * Mocha global.
  *
  * - _Only supported in the browser._
  */
@JSGlobal("mocha")
@js.native
object mocha extends TopLevel[BrowserMocha]
