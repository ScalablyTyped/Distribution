package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel")
@js.native
object ^ extends js.Object {
  var icons: IconCollections = js.native
  /**
    *
    * Creates and opens a new workbook.  Optionally, the workbook can be pre-populated with a base64-encoded .xlsx file.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param base64File Optional. The base64 encoded .xlsx file. The default value is null.
    */
  def createWorkbook(): js.Promise[scala.Unit] = js.native
  def createWorkbook(base64: java.lang.String): js.Promise[scala.Unit] = js.native
  def getDataCommonPostprocess(response: js.Any, callArgs: js.Any): js.Any = js.native
  def postprocessBindingDescriptor(response: js.Any): js.Any = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def run[T](batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    *
    * @remarks
    *
    * In addition to this signature, the method also has the following signatures:
    *
    * `run<T>(object: OfficeExtension.ClientObject, batch: (context: Excel.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(objects: OfficeExtension.ClientObject[], batch: (context: Excel.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(options: Excel.RunOptions, batch: (context: Excel.RequestContext) => Promise<T>): Promise<T>;`
    *
    * `run<T>(batch: (context: Excel.RequestContext) => Promise<T>): Promise<T>;`
    *
    * @param context - A previously-created object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def run[T](
    context: officeDashJsLib.OfficeExtensionNs.ClientRequestContext,
    batch: js.Function1[/* context */ RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def run[T](
    `object`: officeDashJsLib.OfficeExtensionNs.ClientObject,
    batch: js.Function1[/* context */ RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def run[T](
    objects: js.Array[officeDashJsLib.OfficeExtensionNs.ClientObject],
    batch: js.Function1[/* context */ RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param options - The additional options for this Excel.run which specify previous objects, whether to delay the request for cell edit, session info, etc.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def run[T](options: RunOptions, batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
}

