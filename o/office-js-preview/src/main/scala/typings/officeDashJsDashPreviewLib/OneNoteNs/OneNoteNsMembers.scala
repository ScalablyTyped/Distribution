package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OneNote")
@js.native
object OneNoteNsMembers extends js.Object {
  /**
    * Executes a batch script that performs actions on the OneNote object model, using a new request context. When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * @param batch - A function that takes in an OneNote.RequestContext and returns a promise (typically, just the result of "context.sync()"). The context parameter facilitates requests to the OneNote application. Since the Office add-in and the OneNote application run in two different processes, the request context is required to get access to the OneNote object model from the add-in.
    */
  def run[T](batch: js.Function1[/* context */ RequestContext, js.Promise[T]]): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the OneNote object model, using the request context of a previously-created API object.
    * @param object - A previously-created API object. The batch will use the same request context as the passed-in object, which means that any changes applied to the object will be picked up by "context.sync()".
    * @param batch - A function that takes in an OneNote.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    * 
    * @remarks
    * In addition to this signature, the method also has the following signatures:
    * 
    * `run<T>(batch: (context: OneNote.RequestContext) => Promise<T>): Promise<T>;`
    * 
    * `run<T>(objects: OfficeExtension.ClientObject[], batch: (context: OneNote.RequestContext) => Promise<T>): Promise<T>;`
    */
  def run[T](
    `object`: officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject,
    batch: js.Function1[/* context */ RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
  /**
    * Executes a batch script that performs actions on the OneNote object model, using the request context of previously-created API objects.
    * @param object - An array of previously-created API objects. The array will be validated to make sure that all of the objects share the same context. The batch will use this shared request context, which means that any changes applied to these objects will be picked up by "context.sync()".
    * @param batch - A function that takes in an OneNote.RequestContext and returns a promise (typically, just the result of "context.sync()"). When the promise is resolved, any tracked objects that were automatically allocated during execution will be released.
    */
  def run[T](
    objects: js.Array[officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject],
    batch: js.Function1[/* context */ RequestContext, js.Promise[T]]
  ): js.Promise[T] = js.native
}

