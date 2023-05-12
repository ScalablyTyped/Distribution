package typings.postgres.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.bufferMod.global.Buffer
import typings.postgres.anon.Cache
import typings.postgres.anon.Timeout
import typings.std.Record
import typings.std.TemplateStringsArray
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sql[TTypes /* <: Record[String, Any] */] extends StObject {
  
  /**
    * Execute the SQL query passed as a template string. Can only be used as template string tag.
    * @param template The template generated from the template string
    * @param parameters Interpoled values of the template string
    * @returns A promise resolving to the result of your query
    */
  def apply[T /* <: js.Array[js.UndefOr[js.Object]] */](
    template: TemplateStringsArray,
    parameters: (ParameterOrFragment[
      /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
    ])*
  ): PendingQuery[T] = js.native
  /**
    * Query helper
    * @param first Define how the helper behave
    * @param rest Other optional arguments, depending on the helper type
    * @returns An helper object usable as tagged template parameter in sql queries
    */
  def apply[T, K /* <: Rest[T] */](
    first: T & (First[
      T, 
      K, 
      /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
    ]),
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type K is not an array type */ rest: K
  ): Return[T, K] = js.native
  
  var END: /* import warning: importer.ImportType#apply Failed type conversion: this['CLOSE'] */ js.Any = js.native
  
  var PostgresError: Instantiable0[typings.postgres.mod.PostgresError] = js.native
  
  def array[T /* <: js.Array[
    SerializableParameter[
      /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
    ]
  ] */](value: T): ArrayParameter[T] = js.native
  def array[T /* <: js.Array[
    SerializableParameter[
      /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
    ]
  ] */](value: T, `type`: Double): ArrayParameter[T] = js.native
  
  def begin[T](cb: js.Function1[/* sql */ TransactionSql[TTypes], T | js.Promise[T]]): js.Promise[UnwrapPromiseArray[T]] = js.native
  def begin[T](options: String, cb: js.Function1[/* sql */ TransactionSql[TTypes], T | js.Promise[T]]): js.Promise[UnwrapPromiseArray[T]] = js.native
  
  def end(): js.Promise[Unit] = js.native
  def end(options: Timeout): js.Promise[Unit] = js.native
  
  def file[T /* <: js.Array[Any] */](path: String): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: String,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ]
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: String,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ],
    options: Cache
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: String, options: Cache): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: Double): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: Double,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ]
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: Double,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ],
    options: Cache
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: Double, options: Cache): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: Buffer): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: Buffer,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ]
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: Buffer,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ],
    options: Cache
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: Buffer, options: Cache): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: URL): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: URL,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ]
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](
    path: URL,
    args: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ],
    options: Cache
  ): PendingQuery[T] = js.native
  def file[T /* <: js.Array[Any] */](path: URL, options: Cache): PendingQuery[T] = js.native
  
  def json(value: JSONValue): Parameter[SerializableParameter[scala.Nothing]] = js.native
  
  def largeObject(): js.Promise[LargeObject] = js.native
  def largeObject(oid: Double): js.Promise[LargeObject] = js.native
  def largeObject(oid: Double, /** @default 0x00020000 | 0x00040000 */ mode: Double): js.Promise[LargeObject] = js.native
  def largeObject(oid: Unit, /** @default 0x00020000 | 0x00040000 */ mode: Double): js.Promise[LargeObject] = js.native
  
  def listen(channel: String, onnotify: js.Function1[/* value */ String, Unit]): js.Promise[ListenMeta] = js.native
  def listen(channel: String, onnotify: js.Function1[/* value */ String, Unit], onlisten: js.Function0[Unit]): js.Promise[ListenMeta] = js.native
  
  def notify(channel: String, payload: String): js.Promise[js.Array[Any] & ResultMeta[Null]] = js.native
  
  var options: ParsedOptions[TTypes] = js.native
  
  var parameters: ConnectionParameters = js.native
  
  def subscribe(event: String, cb: js.Function2[/* row */ Row | Null, /* info */ ReplicationEvent, Unit]): js.Promise[SubscriptionHandle] = js.native
  def subscribe(
    event: String,
    cb: js.Function2[/* row */ Row | Null, /* info */ ReplicationEvent, Unit],
    onsubscribe: js.Function0[Unit]
  ): js.Promise[SubscriptionHandle] = js.native
  
  def typed[T](value: T, oid: Double): Parameter[T] = js.native
  @JSName("typed")
  var typed_Original: (js.Function2[/* value */ Any, /* oid */ Double, Parameter[Any]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ name in keyof TTypes ]: (value : TTypes[name]): postgres.postgres.Parameter<TTypes[name]>} */ js.Any) = js.native
  
  var types: /* import warning: importer.ImportType#apply Failed type conversion: this['typed'] */ js.Any = js.native
  
  def unsafe[T /* <: js.Array[Any] */](query: String): PendingQuery[T] = js.native
  def unsafe[T /* <: js.Array[Any] */](
    query: String,
    parameters: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ]
  ): PendingQuery[T] = js.native
  def unsafe[T /* <: js.Array[Any] */](
    query: String,
    parameters: js.Array[
      ParameterOrJSON[
        /* import warning: importer.ImportType#apply Failed type conversion: TTypes[keyof TTypes] */ js.Any
      ]
    ],
    queryOptions: UnsafeQueryOptions
  ): PendingQuery[T] = js.native
  def unsafe[T /* <: js.Array[Any] */](query: String, parameters: Unit, queryOptions: UnsafeQueryOptions): PendingQuery[T] = js.native
}
