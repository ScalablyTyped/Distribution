package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.anon.CaStore
import typings.nodeForge.mod.Byte
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.tls.^
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MaxFragment: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("MaxFragment").asInstanceOf[Double]

inline def SupportedVersions: js.Array[ProtocolVersion] = ^.asInstanceOf[js.Dynamic].selectDynamic("SupportedVersions").asInstanceOf[js.Array[ProtocolVersion]]

inline def Version: ProtocolVersion = ^.asInstanceOf[js.Dynamic].selectDynamic("Version").asInstanceOf[ProtocolVersion]

inline def Versions: js.Array[ProtocolVersion] = ^.asInstanceOf[js.Dynamic].selectDynamic("Versions").asInstanceOf[js.Array[ProtocolVersion]]

inline def createConnection(options: CaStore): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Connection]

inline def createSessionCache(): SessionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")().asInstanceOf[SessionCache]
inline def createSessionCache(cache: StringDictionary[Session]): SessionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[SessionCache]
inline def createSessionCache(cache: StringDictionary[Session], capacity: Double): SessionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[SessionCache]
inline def createSessionCache(cache: Unit, capacity: Double): SessionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[SessionCache]
inline def createSessionCache(cache: SessionCache): SessionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[SessionCache]
inline def createSessionCache(cache: SessionCache, capacity: Double): SessionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[SessionCache]

inline def hmacSha1(key: String, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[Bytes]
inline def hmacSha1(key: js.Array[Byte], seqNum: js.Tuple2[Double, Double], record: Record): Bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[Bytes]
inline def hmacSha1(key: ByteBuffer, seqNum: js.Tuple2[Double, Double], record: Record): Bytes = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[Bytes]

inline def prfTls1(secret: String, label: String, seed: String, length: Double): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("prf_tls1")(secret.asInstanceOf[js.Any], label.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]

type ConnectionState = Any
