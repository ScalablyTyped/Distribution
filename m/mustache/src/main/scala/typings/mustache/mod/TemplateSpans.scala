package typings.mustache.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateSpans
  extends Array[
      (js.Tuple4[TemplateSpanType, String, Double, Double]) | (js.Tuple6[TemplateSpanType, String, Double, Double, TemplateSpans, Double]) | (js.Tuple7[TemplateSpanType, String, Double, Double, String, Double, Boolean])
    ]
