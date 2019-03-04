package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a common interface for the application-defined tasks of closing, releasing, or resetting resources held by instances of a registered Microsoft Ajax Library class.
  * Implement the IDisposable interface to provide a common interface for closing or releasing resources held by instances of your registered Microsoft Ajax Library class.
  * You register an interface by when you register the class by calling the Type.registerClass method. You specify IDisposable in the interfaceTypes parameter when you call Type.registerClass.
  */
trait IDisposable extends js.Object {
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  def dispose(): scala.Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: js.Function0[scala.Unit]): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = dispose)
  
    __obj.asInstanceOf[IDisposable]
  }
}

