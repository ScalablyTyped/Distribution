package typings.onsenui.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsProgressCircularElement extends HTMLElement {
  
  /**
    * @description If this property is `true`, an infinite looping animation will be shown.
    */
  var indeterminate: Boolean = js.native
  
  /**
    * @description Current secondary progress. Should be a value between 0 and 100.
    */
  var secondaryValue: Double = js.native
  
  /**
    * @description Current progress. Should be a value between 0 and 100.
    */
  var value: Double = js.native
}
