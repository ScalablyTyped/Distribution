package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
   // default: undefined
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ java.lang.String, java.lang.String | scala.Unit]] = js.undefined
         // default: undefined
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit]] = js.undefined
                // default: false
  var comments: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
    // default: undefined
  var complete: js.UndefOr[
    js.Function2[/* results */ ParseResult, /* file */ js.UndefOr[stdLib.File], scala.Unit]
  ] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
     // default: false
  var download: js.UndefOr[scala.Boolean] = js.undefined
           // default: false
  var dynamicTyping: js.UndefOr[scala.Boolean] = js.undefined
                // default: 0
  var encoding: js.UndefOr[java.lang.String] = js.undefined
   // default: undefined
  var error: js.UndefOr[
    js.Function2[/* error */ ParseError, /* file */ js.UndefOr[stdLib.File], scala.Unit]
  ] = js.undefined
        // default: false
  var fastMode: js.UndefOr[scala.Boolean] = js.undefined
              // default: '"'
  var header: js.UndefOr[scala.Boolean] = js.undefined
              // default: ","
  var newline: js.UndefOr[java.lang.String] = js.undefined
         // default: false
  var preview: js.UndefOr[scala.Double] = js.undefined
                // default: "\r\n"
  var quoteChar: js.UndefOr[java.lang.String] = js.undefined
              // default: false
  var skipEmptyLines: js.UndefOr[scala.Boolean | papaparseLib.papaparseLibStrings.greedy] = js.undefined
       // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit]] = js.undefined
      // default: undefined
  var transform: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* field */ java.lang.String | scala.Double, _]
  ] = js.undefined
                // default: false
  var trimHeaders: js.UndefOr[scala.Boolean] = js.undefined
              // default: undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
               // default: ""
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

