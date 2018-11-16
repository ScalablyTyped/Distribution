package typings
package openui5Lib.sapNs.uiNs.modelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.Context")
@js.native
abstract class Context protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
           * Constructor for Context class.
           * @param oModel the model
           * @param sPath the path
           * @param oContext the context object
          */
  def this(oModel: Model, sPath: java.lang.String, oContext: js.Any) = this()
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
  def getObject(sPath: java.lang.String): js.Any = js.native
  /**
           * Gets the (model dependent) object the context points to or the object with the given relative
           * binding path
           * @param sPath the binding path
           * @param mParameters additional model specific parameters (optional)
           * @returns the context object
          */
  def getObject(sPath: java.lang.String, mParameters: js.Any): js.Any = js.native
  /**
           * Getter for path of the context itself or a subpath
           * @param sPath the binding path
           * @returns the binding path
          */
  def getPath(sPath: java.lang.String): java.lang.String = js.native
  /**
           * Gets the property with the given relative binding path
           * @param sPath the binding path
          */
  def getProperty(sPath: java.lang.String): js.Any = js.native
}

