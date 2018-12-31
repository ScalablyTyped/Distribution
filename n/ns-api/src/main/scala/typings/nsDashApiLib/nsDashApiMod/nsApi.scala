package typings
package nsDashApiLib.nsDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait nsApi extends js.Object {
  /** Prijzen - tariffs */
  def prijzen(params: js.Object, callback: js.Function2[/* err */ js.Any, /* data */ js.Object, scala.Unit]): scala.Unit = js.native
  /**
    * Reisadvies - travel advise
    */
  def reisadvies(
    params: js.Object,
    callback: js.Function2[/* err */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def stations(callback: js.Function2[/* err */ java.lang.String, /* data */ js.Object, scala.Unit]): scala.Unit = js.native
  /**
    * List available stations
    *
    * @param [treeKey] - Group by this key
    */
  def stations(
    treeKey: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /** List disruptions */
  def storingen(
    params: js.Object,
    callback: js.Function2[/* err */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Vertrektijden - departure times
    *
    * @param station - Station ID
    */
  def vertrektijden(
    station: java.lang.String,
    callback: js.Function2[/* err */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
}

