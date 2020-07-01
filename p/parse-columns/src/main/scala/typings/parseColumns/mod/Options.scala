package typings.parseColumns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[ValuesType /* <: js.Any */] extends js.Object {
  /**
  		Headers to use instead of the existing ones.
  		*/
  val headers: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		Separator to split columns on.
  		@default ' '
  		*/
  val separator: js.UndefOr[String] = js.undefined
  /**
  		Transform elements.
  		Useful for being able to cleanup or change the type of elements.
  		*/
  val transform: js.UndefOr[
    js.Function4[
      /* element */ String, 
      /* header */ String, 
      /* columnIndex */ Double, 
      /* rowIndex */ Double, 
      ValuesType
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply[/* <: js.Any */ ValuesType](
    headers: js.Array[String] = null,
    separator: String = null,
    transform: (/* element */ String, /* header */ String, /* columnIndex */ Double, /* rowIndex */ Double) => ValuesType = null
  ): Options[ValuesType] = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction4(transform))
    __obj.asInstanceOf[Options[ValuesType]]
  }
}

