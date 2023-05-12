package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.Excel.IconCollections
import typings.officeJsPreview.Excel.RunOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import typings.officeJsPreview.global.Excel.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  *
  * Creates and opens a new workbook.  Optionally, the workbook can be pre-populated with a base64-encoded .xlsx file.
  * Note: Macros can be a security risk. If this API is used to create a workbook that includes a macro, the add-in user will be prompted with a "Trust this add-in?" dialog in the Excel UI. The user must select the "Trust add-in" button to proceed.
  * 
  * [Api set: ExcelApi 1.8]
  *
  * @param base64File Optional. The base64 encoded .xlsx file. The default value is null.
  */
inline def createWorkbook(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkbook")().asInstanceOf[js.Promise[Unit]]
inline def createWorkbook(base64: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkbook")(base64.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def getDataCommonPostprocess(response: Any, callArgs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataCommonPostprocess")(response.asInstanceOf[js.Any], callArgs.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def icons: IconCollections = ^.asInstanceOf[js.Dynamic].selectDynamic("icons").asInstanceOf[IconCollections]
inline def icons_=(x: IconCollections): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icons")(x.asInstanceOf[js.Any])

inline def postprocessBindingDescriptor(response: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("postprocessBindingDescriptor")(response.asInstanceOf[js.Any]).asInstanceOf[Any]

/**
  * Executes a batch script that performs actions on the Excel object model, using a new RequestContext. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
  */
inline def run[T](batch: js.Function1[/* context */ typings.officeJsPreview.Excel.RequestContext, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(batch.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
/**
  * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
  *
  * @param context - A previously-created object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
  */
inline def run[T](
  context: ClientRequestContext,
  batch: js.Function1[/* context */ typings.officeJsPreview.Excel.RequestContext, js.Promise[T]]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(context.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
/**
  * Executes a batch script that performs actions on the Excel object model, using the RequestContext of previously-created API objects.
  * @param objects - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared RequestContext, which means that any changes applied to these objects will be picked up by "context.sync()".
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
  */
inline def run[T](
  objects: js.Array[ClientObject],
  batch: js.Function1[/* context */ typings.officeJsPreview.Excel.RequestContext, js.Promise[T]]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(objects.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
/**
  * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
  * @param object - A previously-created API object. The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
  */
inline def run[T](
  `object`: ClientObject,
  batch: js.Function1[/* context */ typings.officeJsPreview.Excel.RequestContext, js.Promise[T]]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(`object`.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
/**
  * Executes a batch script that performs actions on the Excel object model, using the RequestContext of a previously-created API object. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
  * @param options - The additional options for this Excel.run which specify previous objects, whether to delay the request for cell edit, session info, etc.
  * @param batch - A function that takes in a RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the Excel application. Since the Office add-in and the Excel application run in two different processes, the RequestContext is required to get access to the Excel object model from the add-in.
  */
inline def run[T](
  options: RunOptions,
  batch: js.Function1[/* context */ typings.officeJsPreview.Excel.RequestContext, js.Promise[T]]
): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
