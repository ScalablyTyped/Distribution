package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilXmlpreprocessorMod extends Shortcut {
  
  @JSImport("sap/ui/core/util/XMLPreprocessor", JSImport.Default)
  @js.native
  val default: XMLPreprocessor = js.native
  
  @js.native
  trait IContext extends StObject {
    
    var __implements__sap_ui_core_util_XMLPreprocessor_IContext: Boolean = js.native
    
    /**
      * @SINCE 1.31.0
      *
      * Returns a context interface for the indicated part in case of the root formatter of a composite binding.
      * The new interface provides access to the original settings, but only to the model and path of the indicated
      * part:
      * ```javascript
      *
      * this.getInterface(i).getSetting(sName) === this.getSetting(sName);
      * this.getInterface(i).getModel() === this.getModel(i);
      * this.getInterface(i).getPath() === this.getPath(i);
      * ```
      *
      *
      * If a path is given, the new interface points to the resolved path as follows:
      * ```javascript
      *
      * this.getInterface(i, "foo/bar").getPath() === this.getPath(i) + "/foo/bar";
      * this.getInterface(i, "/absolute/path").getPath() === "/absolute/path";
      * ```
      *  A formatter which is not at the root level of a composite binding can also provide a path, but must
      * not provide an index:
      * ```javascript
      *
      * this.getInterface("foo/bar").getPath() === this.getPath() + "/foo/bar";
      * this.getInterface("/absolute/path").getPath() === "/absolute/path";
      * ```
      *  Note that at least one argument must be present.
      *
      * @returns the context interface related to the indicated part
      */
    def getInterface(): IContext = js.native
    def getInterface(/**
      * index of part in case of the root formatter of a composite binding
      */
    iPart: Double): IContext = js.native
    def getInterface(
      /**
      * index of part in case of the root formatter of a composite binding
      */
    iPart: Double,
      /**
      * a path, interpreted relative to `this.getPath(iPart)`
      */
    sPath: String
    ): IContext = js.native
    def getInterface(
      /**
      * index of part in case of the root formatter of a composite binding
      */
    iPart: Unit,
      /**
      * a path, interpreted relative to `this.getPath(iPart)`
      */
    sPath: String
    ): IContext = js.native
    def getInterface(/**
      * a path, interpreted relative to `this.getPath(iPart)`
      */
    sPath: String): IContext = js.native
    
    /**
      * Returns the model related to the current formatter call.
      *
      * @returns the model related to the current formatter call, or (since 1.31.0) `undefined` in case of a
      * root formatter if no `iPart` is given or if `iPart` is out of range
      */
    def getModel(): js.UndefOr[typings.openui5.sapUiModelModelMod.default] = js.native
    def getModel(
      /**
      * index of part in case of the root formatter of a composite binding (since 1.31.0)
      */
    iPart: Double
    ): js.UndefOr[typings.openui5.sapUiModelModelMod.default] = js.native
    
    /**
      * Returns the absolute path related to the current formatter call.
      *
      * @returns the absolute path related to the current formatter call, or (since 1.31.0) `undefined` in case
      * of a root formatter if no `iPart` is given or if `iPart` is out of range
      */
    def getPath(): js.UndefOr[String] = js.native
    def getPath(
      /**
      * index of part in case of the root formatter of a composite binding (since 1.31.0)
      */
    iPart: Double
    ): js.UndefOr[String] = js.native
    
    /**
      * Returns the value of the setting with the given name which was provided to the XML template processing.
      *
      * @returns the value of the setting
      */
    def getSetting(/**
      * the name of the setting
      */
    sName: String): Any = js.native
  }
  
  /**
    * @SINCE 1.27.1
    *
    * The XML pre-processor for template instructions in XML views.
    */
  trait XMLPreprocessor extends StObject
  
  type _To = XMLPreprocessor
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreUtilXmlpreprocessorMod.foo` */
  override def _to: XMLPreprocessor = default
}
