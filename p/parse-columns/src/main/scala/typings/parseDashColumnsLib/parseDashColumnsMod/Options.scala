package typings
package parseDashColumnsLib.parseDashColumnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ValuesType /* <: js.Any */] extends js.Object {
  /**
  		Headers to use instead of the existing ones.
  		*/
  val headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		Separator to split columns on.
  		@default ' '
  		*/
  val separator: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Transform elements.
  		Useful for being able to cleanup or change the type of elements.
  		*/
  val transform: js.UndefOr[
    js.Function4[
      /* element */ java.lang.String, 
      /* header */ java.lang.String, 
      /* columnIndex */ scala.Double, 
      /* rowIndex */ scala.Double, 
      ValuesType
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply[ValuesType /* <: js.Any */](
    headers: js.Array[java.lang.String] = null,
    separator: java.lang.String = null,
    transform: (/* element */ java.lang.String, /* header */ java.lang.String, /* columnIndex */ scala.Double, /* rowIndex */ scala.Double) => ValuesType = null
  ): Options[ValuesType] = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction4(transform))
    __obj.asInstanceOf[Options[ValuesType]]
  }
}

