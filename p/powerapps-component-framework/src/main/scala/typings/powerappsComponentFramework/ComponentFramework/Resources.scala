package typings.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The resource interface of context.resources
	 */
trait Resources extends js.Object {
  /**
  		 * Gets a resource referenced by the control manifest.
  		 * @param id The resource string identifier.
  		 * @param success The success callback. Resource data is returned in base 64 encoded format.
  		 * @param failure The failure callback.
  		 */
  def getResource(id: String, success: js.Function1[/* data */ String, Unit], failure: js.Function0[Unit]): Unit
  /**
  		 * Get the localized string for the given identifier.
  		 * @param id name of resource in the control manifest.
  		 */
  def getString(id: String): String
}

object Resources {
  @scala.inline
  def apply(
    getResource: (String, js.Function1[/* data */ String, Unit], js.Function0[Unit]) => Unit,
    getString: String => String
  ): Resources = {
    val __obj = js.Dynamic.literal(getResource = js.Any.fromFunction3(getResource), getString = js.Any.fromFunction1(getString))
  
    __obj.asInstanceOf[Resources]
  }
}

