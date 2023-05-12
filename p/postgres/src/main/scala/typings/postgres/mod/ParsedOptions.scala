package typings.postgres.mod

import typings.postgres.anon.PartialConnectionParamete
import typings.postgres.postgresStrings.`verify-full`
import typings.postgres.postgresStrings.allow
import typings.postgres.postgresStrings.prefer
import typings.postgres.postgresStrings.require
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedOptions[T /* <: Record[String, Any] */]
  extends StObject
     with BaseOptions[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ name in keyof T ]: postgres.postgres.PostgresType<T[name]>} */ js.Any
    ] {
  
  /** @inheritdoc */
  @JSName("host")
  var host_ParsedOptions: js.Array[String]
  
  var parsers: Record[Double, js.Function1[/* value */ Any, Any]]
  
  /** @inheritdoc */
  var pass: Null
  
  /** @inheritdoc */
  @JSName("port")
  var port_ParsedOptions: js.Array[Double]
  
  var serializers: Record[Double, js.Function1[/* value */ Any, Any]]
  
  /** @inheritdoc */
  @JSName("transform")
  var transform_ParsedOptions: Transform
}
object ParsedOptions {
  
  inline def apply[T /* <: Record[String, Any] */](
    backoff: Boolean | (js.Function1[/* attemptNum */ Double, Double]),
    connect_timeout: Double,
    connection: PartialConnectionParamete,
    database: String,
    debug: Boolean | (js.Function4[
      /* connection */ Double, 
      /* query */ String, 
      /* parameters */ js.Array[Any], 
      /* paramTypes */ js.Array[Any], 
      Unit
    ]),
    fetch_types: Boolean,
    host: js.Array[String],
    max: Double,
    onclose: Double => Unit,
    onnotice: Notice => Unit,
    onparameter: (String, Any) => Unit,
    parsers: Record[Double, js.Function1[/* value */ Any, Any]],
    pass: Null,
    port: js.Array[Double],
    prepare: Boolean,
    publications: String,
    serializers: Record[Double, js.Function1[/* value */ Any, Any]],
    ssl: require | allow | prefer | `verify-full` | Boolean | js.Object,
    transform: Transform,
    types: /* import warning: importer.ImportType#apply Failed type conversion: {[ name in keyof T ]: postgres.postgres.PostgresType<T[name]>} */ js.Any,
    user: String
  ): ParsedOptions[T] = {
    val __obj = js.Dynamic.literal(backoff = backoff.asInstanceOf[js.Any], connect_timeout = connect_timeout.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], fetch_types = fetch_types.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], onclose = js.Any.fromFunction1(onclose), onnotice = js.Any.fromFunction1(onnotice), onparameter = js.Any.fromFunction2(onparameter), parsers = parsers.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prepare = prepare.asInstanceOf[js.Any], publications = publications.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], keep_alive = null, max_lifetime = null)
    __obj.asInstanceOf[ParsedOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedOptions[?], T /* <: Record[String, Any] */] (val x: Self & ParsedOptions[T]) extends AnyVal {
    
    inline def setHost(value: js.Array[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostVarargs(value: String*): Self = StObject.set(x, "host", js.Array(value*))
    
    inline def setParsers(value: Record[Double, js.Function1[/* value */ Any, Any]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    
    inline def setPass(value: Null): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPort(value: js.Array[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortVarargs(value: Double*): Self = StObject.set(x, "port", js.Array(value*))
    
    inline def setSerializers(value: Record[Double, js.Function1[/* value */ Any, Any]]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
