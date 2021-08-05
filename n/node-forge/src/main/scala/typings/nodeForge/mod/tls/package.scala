package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def MaxFragment: scala.Double = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("MaxFragment").asInstanceOf[scala.Double]

inline def SupportedVersions: js.Array[typings.nodeForge.mod.tls.ProtocolVersion] = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("SupportedVersions").asInstanceOf[js.Array[typings.nodeForge.mod.tls.ProtocolVersion]]

inline def Version: typings.nodeForge.mod.tls.ProtocolVersion = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("Version").asInstanceOf[typings.nodeForge.mod.tls.ProtocolVersion]

inline def Versions: js.Array[typings.nodeForge.mod.tls.ProtocolVersion] = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("Versions").asInstanceOf[js.Array[typings.nodeForge.mod.tls.ProtocolVersion]]

inline def createConnection(options: typings.nodeForge.anon.CaStore): typings.nodeForge.mod.tls.Connection = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.tls.Connection]

inline def createSessionCache(): typings.nodeForge.mod.tls.SessionCache = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")().asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
inline def createSessionCache(cache: org.scalablytyped.runtime.StringDictionary[typings.nodeForge.mod.tls.Session]): typings.nodeForge.mod.tls.SessionCache = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
inline def createSessionCache(
  cache: org.scalablytyped.runtime.StringDictionary[typings.nodeForge.mod.tls.Session],
  capacity: scala.Double
): typings.nodeForge.mod.tls.SessionCache = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
inline def createSessionCache(cache: scala.Unit, capacity: scala.Double): typings.nodeForge.mod.tls.SessionCache = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
inline def createSessionCache(cache: typings.nodeForge.mod.tls.SessionCache): typings.nodeForge.mod.tls.SessionCache = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
inline def createSessionCache(cache: typings.nodeForge.mod.tls.SessionCache, capacity: scala.Double): typings.nodeForge.mod.tls.SessionCache = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]

inline def hmacSha1(
  key: java.lang.String,
  seqNum: js.Tuple2[scala.Double, scala.Double],
  record: typings.nodeForge.mod.tls.Record
): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
inline def hmacSha1(
  key: js.Array[typings.nodeForge.mod.Byte],
  seqNum: js.Tuple2[scala.Double, scala.Double],
  record: typings.nodeForge.mod.tls.Record
): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
inline def hmacSha1(
  key: typings.nodeForge.mod.util.ByteBuffer,
  seqNum: js.Tuple2[scala.Double, scala.Double],
  record: typings.nodeForge.mod.tls.Record
): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]

inline def prfTls1(secret: java.lang.String, label: java.lang.String, seed: java.lang.String, length: scala.Double): typings.nodeForge.mod.util.ByteBuffer = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("prf_tls1")(secret.asInstanceOf[js.Any], label.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.util.ByteBuffer]

type ConnectionState = js.Any
