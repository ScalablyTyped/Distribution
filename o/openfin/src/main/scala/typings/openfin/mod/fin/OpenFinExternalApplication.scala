package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalApplication
  * An object representing an application. Allows the developer to create, execute, show and close an application, as well as listen to application events.
  */
@js.native
trait OpenFinExternalApplication extends StObject {
  
  /**
    * Registers an event listener on the specified event.
    */
  def addEventListener(`type`: OpenFinExternalApplicationEventType, listener: js.Function0[Unit]): Unit = js.native
  def addEventListener(
    `type`: OpenFinExternalApplicationEventType,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinExternalApplicationEventType,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinExternalApplicationEventType,
    listener: js.Function0[Unit],
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Retrieves information about the application.
    */
  def getInfo(): Unit = js.native
  def getInfo(callback: js.Function1[/* info */ ExternalApplicationInfo, Unit]): Unit = js.native
  def getInfo(
    callback: js.Function1[/* info */ ExternalApplicationInfo, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def getInfo(callback: Unit, errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]): Unit = js.native
  
  /**
    * Removes a previously registered event listener from the specified event.
    */
  def removeEventListener(`type`: OpenFinExternalApplicationEventType, listener: js.Function0[Unit]): Unit = js.native
  def removeEventListener(
    `type`: OpenFinExternalApplicationEventType,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinExternalApplicationEventType,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinExternalApplicationEventType,
    listener: js.Function0[Unit],
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
}
