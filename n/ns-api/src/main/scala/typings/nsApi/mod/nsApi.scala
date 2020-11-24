package typings.nsApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait nsApi extends js.Object {
  
  /** Prijzen - tariffs */
  def prijzen(params: js.Object, callback: js.Function2[/* err */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  
  /**
    * Reisadvies - travel advise
    */
  def reisadvies(params: js.Object, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
  
  def stations(callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
  /**
    * List available stations
    *
    * @param [treeKey] - Group by this key
    */
  def stations(treeKey: String, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
  
  /** List disruptions */
  def storingen(params: js.Object, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
  
  /**
    * Vertrektijden - departure times
    *
    * @param station - Station ID
    */
  def vertrektijden(station: String, callback: js.Function2[/* err */ String, /* data */ js.Object, Unit]): Unit = js.native
}
