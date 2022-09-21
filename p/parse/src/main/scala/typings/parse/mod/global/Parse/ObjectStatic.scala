package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.Instantiable1
import typings.parse.anon.ClassName
import typings.parse.mod.global.Parse.Object.DestroyAllOptions
import typings.parse.mod.global.Parse.Object.FetchAllOptions
import typings.parse.mod.global.Parse.Object.SaveAllOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectStatic[T /* <: Object[Attributes] */] extends StObject {
  
  def createWithoutData(id: String): T = js.native
  
  def destroyAll[T /* <: Object[Attributes] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: Object[Attributes] */](list: js.Array[T], options: DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  
  def extend(className: String): Any = js.native
  def extend(className: String, protoProps: Any): Any = js.native
  def extend(className: String, protoProps: Any, classProps: Any): Any = js.native
  def extend(className: String, protoProps: Unit, classProps: Any): Any = js.native
  def extend(className: ClassName): Any = js.native
  def extend(className: ClassName, protoProps: Any): Any = js.native
  def extend(className: ClassName, protoProps: Any, classProps: Any): Any = js.native
  def extend(className: ClassName, protoProps: Unit, classProps: Any): Any = js.native
  
  def fetchAll[T /* <: Object[Attributes] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  
  def fetchAllIfNeeded[T /* <: Object[Attributes] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: Object[Attributes] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  
  @JSName("fetchAllIfNeededWithInclude")
  def fetchAllIfNeededWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any
  ): js.Promise[js.Array[T]] = js.native
  @JSName("fetchAllIfNeededWithInclude")
  def fetchAllIfNeededWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any,
    options: RequestOptions
  ): js.Promise[js.Array[T]] = js.native
  @JSName("fetchAllIfNeededWithInclude")
  def fetchAllIfNeededWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any
    ]
  ): js.Promise[js.Array[T]] = js.native
  @JSName("fetchAllIfNeededWithInclude")
  def fetchAllIfNeededWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any
    ],
    options: RequestOptions
  ): js.Promise[js.Array[T]] = js.native
  
  @JSName("fetchAllWithInclude")
  def fetchAllWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any
  ): js.Promise[js.Array[T]] = js.native
  @JSName("fetchAllWithInclude")
  def fetchAllWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any,
    options: RequestOptions
  ): js.Promise[js.Array[T]] = js.native
  @JSName("fetchAllWithInclude")
  def fetchAllWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any
    ]
  ): js.Promise[js.Array[T]] = js.native
  @JSName("fetchAllWithInclude")
  def fetchAllWithInclude_attributes[T /* <: Object[Attributes] */](
    list: js.Array[T],
    keys: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T['attributes'] */ js.Any
    ],
    options: RequestOptions
  ): js.Promise[js.Array[T]] = js.native
  
  def fromJSON(json: Any): T = js.native
  def fromJSON(json: Any, `override`: Boolean): T = js.native
  
  def pinAll(objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
  
  def pinAllWithName(name: String, objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
  
  def registerSubclass(className: String, clazz: Instantiable1[/* options */ js.UndefOr[Any], T]): Unit = js.native
  
  def saveAll[T /* <: js.Array[Object[Attributes]] */](list: T): js.Promise[T] = js.native
  def saveAll[T /* <: js.Array[Object[Attributes]] */](list: T, options: SaveAllOptions): js.Promise[T] = js.native
  
  def unPinAll(objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
  
  def unPinAllObjects(): js.Promise[Unit] = js.native
  
  def unPinAllObjectsWithName(name: String): js.Promise[Unit] = js.native
  
  def unPinAllWithName(name: String, objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
}
