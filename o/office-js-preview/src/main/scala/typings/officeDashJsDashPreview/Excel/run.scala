package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.run")
@js.native
object run extends js.Object {
  /**
    * Executes a batch script that performs actions on the Excel object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def apply[T](batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
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
  def apply[T](context: ClientRequestContext, batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of previously-created API objects.
    * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def apply[T](objects: js.Array[ClientObject], batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def apply[T](`object`: ClientObject, batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param options - The additional options for this Excel.run which specify previous objects, whether to delay the request for cell edit, session info, etc.
    * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
    */
  def apply[T](options: RunOptions, batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
}

