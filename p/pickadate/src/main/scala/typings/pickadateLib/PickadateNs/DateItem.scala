package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DateItem extends Item {
  /**
           * The date of the month.
           */
  var date: scala.Double
  /**
           * The day of the week with zero-as-index.
           */
  var day: scala.Double
  /**
           * The month with zero-as-index.
           */
  var month: scala.Double
  /**
           * The underlying JavaScript Date object.
           */
  var obj: stdLib.Date
  /**
           * The full year.
           */
  var year: scala.Double
}

