package typings.nodeForge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tls {
  
  type ConnectionState = js.Any
  
  @scala.inline
  def MaxFragment: scala.Double = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("MaxFragment").asInstanceOf[scala.Double]
  
  @scala.inline
  def SupportedVersions: js.Array[typings.nodeForge.mod.tls.ProtocolVersion] = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("SupportedVersions").asInstanceOf[js.Array[typings.nodeForge.mod.tls.ProtocolVersion]]
  
  @scala.inline
  def Version: typings.nodeForge.mod.tls.ProtocolVersion = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("Version").asInstanceOf[typings.nodeForge.mod.tls.ProtocolVersion]
  
  @scala.inline
  def Versions: js.Array[typings.nodeForge.mod.tls.ProtocolVersion] = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].selectDynamic("Versions").asInstanceOf[js.Array[typings.nodeForge.mod.tls.ProtocolVersion]]
  
  @scala.inline
  def createConnection(options: typings.nodeForge.anon.CaStore): typings.nodeForge.mod.tls.Connection = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.tls.Connection]
  
  @scala.inline
  def createSessionCache(): typings.nodeForge.mod.tls.SessionCache = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")().asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: js.UndefOr[scala.Nothing], capacity: scala.Double): typings.nodeForge.mod.tls.SessionCache = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: org.scalablytyped.runtime.StringDictionary[typings.nodeForge.mod.tls.Session]): typings.nodeForge.mod.tls.SessionCache = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(
    cache: org.scalablytyped.runtime.StringDictionary[typings.nodeForge.mod.tls.Session],
    capacity: scala.Double
  ): typings.nodeForge.mod.tls.SessionCache = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: typings.nodeForge.mod.tls.SessionCache): typings.nodeForge.mod.tls.SessionCache = typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any]).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
  @scala.inline
  def createSessionCache(cache: typings.nodeForge.mod.tls.SessionCache, capacity: scala.Double): typings.nodeForge.mod.tls.SessionCache = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("createSessionCache")(cache.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.tls.SessionCache]
  
  @scala.inline
  def hmacSha1(
    key: java.lang.String,
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: typings.nodeForge.mod.tls.Record
  ): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
  @scala.inline
  def hmacSha1(
    key: js.Array[typings.nodeForge.mod.Byte],
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: typings.nodeForge.mod.tls.Record
  ): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
  @scala.inline
  def hmacSha1(
    key: typings.nodeForge.mod.util.ByteBuffer,
    seqNum: js.Tuple2[scala.Double, scala.Double],
    record: typings.nodeForge.mod.tls.Record
  ): typings.nodeForge.mod.Bytes = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha1")(key.asInstanceOf[js.Any], seqNum.asInstanceOf[js.Any], record.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.Bytes]
  
  @scala.inline
  def prfTls1(secret: java.lang.String, label: java.lang.String, seed: java.lang.String, length: scala.Double): typings.nodeForge.mod.util.ByteBuffer = (typings.nodeForge.mod.tls.^.asInstanceOf[js.Dynamic].applyDynamic("prf_tls1")(secret.asInstanceOf[js.Any], label.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.nodeForge.mod.util.ByteBuffer]
}
