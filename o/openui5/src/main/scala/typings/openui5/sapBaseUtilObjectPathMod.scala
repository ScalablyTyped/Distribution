package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseUtilObjectPathMod extends Shortcut {
  
  @JSImport("sap/base/util/ObjectPath", JSImport.Default)
  @js.native
  val default: ObjectPath = js.native
  
  /**
    * @SINCE 1.58
    *
    * Manages an object path.
    *
    * The object path can be just created with {@link #.create}, then an empty nested object path will be created
    * from the provided string. If a value is set for an object path {@link #.set} it is also created if it
    * not already exists. Values can be retrieved from the objectpath with {@link #get}.
    */
  @js.native
  trait ObjectPath extends StObject {
    
    /**
      * Creates a object path from the provided path in the provided root context.
      *
      * The provided path is used to navigate through the nested objects, starting with the root context.
      *
      * @returns The newly created context object, e.g. base.my.test.module
      */
    def create(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: String
    ): js.Object = js.native
    def create(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: String,
      /**
      * Root context where the path starts
      */
    oRootContext: js.Object
    ): js.Object = js.native
    def create(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: js.Array[String]
    ): js.Object = js.native
    def create(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: js.Array[String],
      /**
      * Root context where the path starts
      */
    oRootContext: js.Object
    ): js.Object = js.native
    
    /**
      * Returns a value located in the provided path. If the provided path cannot be resolved completely, `undefined`
      * is returned.
      *
      * The provided object path is used to navigate through the nested objects, starting with the root context.
      * If no root context is provided, the object path begins with `window`.
      *
      * @returns Returns the value located in the provided path, or `undefined` if the path does not exist completely.
      */
    def get(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: String
    ): js.UndefOr[Any] = js.native
    def get(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: String,
      /**
      * Root context where the path starts
      */
    oRootContext: js.Object
    ): js.UndefOr[Any] = js.native
    def get(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: js.Array[String]
    ): js.UndefOr[Any] = js.native
    def get(
      /**
      * Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: js.Array[String],
      /**
      * Root context where the path starts
      */
    oRootContext: js.Object
    ): js.UndefOr[Any] = js.native
    
    /**
      * Sets a value located in the provided path.
      *
      * The provided path is used to navigate through the nested objects, starting with the root context.
      *
      * **Note:** Ensures that the object path exists.
      */
    def set(
      /**
      * vObjectPath Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: String,
      /**
      * The value to be set in the root context's object path
      */
    vValue: Any
    ): Unit = js.native
    def set(
      /**
      * vObjectPath Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: String,
      /**
      * The value to be set in the root context's object path
      */
    vValue: Any,
      /**
      * Root context where the path starts
      */
    oRootContext: js.Object
    ): Unit = js.native
    def set(
      /**
      * vObjectPath Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: js.Array[String],
      /**
      * The value to be set in the root context's object path
      */
    vValue: Any
    ): Unit = js.native
    def set(
      /**
      * vObjectPath Path as string where each name is separated by '.'. Can also be an array of names.
      */
    vObjectPath: js.Array[String],
      /**
      * The value to be set in the root context's object path
      */
    vValue: Any,
      /**
      * Root context where the path starts
      */
    oRootContext: js.Object
    ): Unit = js.native
  }
  
  type _To = ObjectPath
  
  /* This means you don't have to write `default`, but can instead just say `sapBaseUtilObjectPathMod.foo` */
  override def _to: ObjectPath = default
}
