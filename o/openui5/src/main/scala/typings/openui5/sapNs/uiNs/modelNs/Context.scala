package typings.openui5.sapNs.uiNs.modelNs

import typings.openui5.sapNs.uiNs.baseNs.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.Context")
@js.native
abstract class Context protected () extends Object {
  /**
    * Constructor for Context class.
    * @param oModel the model
    * @param sPath the path
    * @param oContext the context object
    */
  def this(oModel: Model, sPath: String, oContext: js.Any) = this()
  /**
    * Getter for model
    * @returns the model
    */
  def getModel(): Model = js.native
  /**
    * Gets the (model dependent) object the context points to or the object with the given relative
    * binding path
    * @param sPath the binding path
    * @param mParameters additional model specific parameters (optional)
    * @returns the context object
    */
  def getObject(sPath: String): js.Any = js.native
  def getObject(sPath: String, mParameters: js.Any): js.Any = js.native
  /**
    * Getter for path of the context itself or a subpath
    * @param sPath the binding path
    * @returns the binding path
    */
  def getPath(sPath: String): String = js.native
  /**
    * Gets the property with the given relative binding path
    * @param sPath the binding path
    */
  def getProperty(sPath: String): js.Any = js.native
}

