package typings.multicodec

import typings.multicodec.mapsMod.CodeNameMap
import typings.multicodec.mapsMod.NameUint8ArrayMap
import typings.multicodec.multicodecStrings.bencode_
import typings.multicodec.multicodecStrings.blake3_
import typings.multicodec.multicodecStrings.bmt_
import typings.multicodec.multicodecStrings.cbor_
import typings.multicodec.multicodecStrings.cidv1_
import typings.multicodec.multicodecStrings.cidv2_
import typings.multicodec.multicodecStrings.cidv3_
import typings.multicodec.multicodecStrings.dccp_
import typings.multicodec.multicodecStrings.dns4_
import typings.multicodec.multicodecStrings.dns6_
import typings.multicodec.multicodecStrings.dns_
import typings.multicodec.multicodecStrings.dnsaddr_
import typings.multicodec.multicodecStrings.garlic32_
import typings.multicodec.multicodecStrings.garlic64_
import typings.multicodec.multicodecStrings.http_
import typings.multicodec.multicodecStrings.https_
import typings.multicodec.multicodecStrings.identity_
import typings.multicodec.multicodecStrings.ip4_
import typings.multicodec.multicodecStrings.ip6_
import typings.multicodec.multicodecStrings.ip6zone_
import typings.multicodec.multicodecStrings.ipfs_
import typings.multicodec.multicodecStrings.json_
import typings.multicodec.multicodecStrings.kangarootwelve_
import typings.multicodec.multicodecStrings.md4_
import typings.multicodec.multicodecStrings.md5_
import typings.multicodec.multicodecStrings.messagepack_
import typings.multicodec.multicodecStrings.multiaddr_
import typings.multicodec.multicodecStrings.multibase_
import typings.multicodec.multicodecStrings.multicodec_
import typings.multicodec.multicodecStrings.multihash_
import typings.multicodec.multicodecStrings.noise_
import typings.multicodec.multicodecStrings.onion3_
import typings.multicodec.multicodecStrings.onion_
import typings.multicodec.multicodecStrings.p2p_
import typings.multicodec.multicodecStrings.path_
import typings.multicodec.multicodecStrings.protobuf_
import typings.multicodec.multicodecStrings.quic_
import typings.multicodec.multicodecStrings.raw_
import typings.multicodec.multicodecStrings.rlp_
import typings.multicodec.multicodecStrings.sctp_
import typings.multicodec.multicodecStrings.sha1_
import typings.multicodec.multicodecStrings.streamid_
import typings.multicodec.multicodecStrings.tcp_
import typings.multicodec.multicodecStrings.thread_
import typings.multicodec.multicodecStrings.tls_
import typings.multicodec.multicodecStrings.udp_
import typings.multicodec.multicodecStrings.udt_
import typings.multicodec.multicodecStrings.unix_
import typings.multicodec.multicodecStrings.utp_
import typings.multicodec.multicodecStrings.ws_
import typings.multicodec.multicodecStrings.wss_
import typings.multicodec.multicodecStrings.x11_
import typings.multicodec.multicodecStrings.zeronet_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multicodec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multicodec", "ARWEAVE_NS")
  @js.native
  val ARWEAVE_NS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BENCODE")
  @js.native
  val BENCODE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BITCOIN_BLOCK")
  @js.native
  val BITCOIN_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BITCOIN_TX")
  @js.native
  val BITCOIN_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BITCOIN_WITNESS_COMMITMENT")
  @js.native
  val BITCOIN_WITNESS_COMMITMENT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_104")
  @js.native
  val BLAKE2B_104: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_112")
  @js.native
  val BLAKE2B_112: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_120")
  @js.native
  val BLAKE2B_120: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_128")
  @js.native
  val BLAKE2B_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_136")
  @js.native
  val BLAKE2B_136: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_144")
  @js.native
  val BLAKE2B_144: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_152")
  @js.native
  val BLAKE2B_152: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_16")
  @js.native
  val BLAKE2B_16: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_160")
  @js.native
  val BLAKE2B_160: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_168")
  @js.native
  val BLAKE2B_168: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_176")
  @js.native
  val BLAKE2B_176: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_184")
  @js.native
  val BLAKE2B_184: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_192")
  @js.native
  val BLAKE2B_192: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_200")
  @js.native
  val BLAKE2B_200: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_208")
  @js.native
  val BLAKE2B_208: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_216")
  @js.native
  val BLAKE2B_216: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_224")
  @js.native
  val BLAKE2B_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_232")
  @js.native
  val BLAKE2B_232: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_24")
  @js.native
  val BLAKE2B_24: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_240")
  @js.native
  val BLAKE2B_240: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_248")
  @js.native
  val BLAKE2B_248: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_256")
  @js.native
  val BLAKE2B_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_264")
  @js.native
  val BLAKE2B_264: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_272")
  @js.native
  val BLAKE2B_272: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_280")
  @js.native
  val BLAKE2B_280: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_288")
  @js.native
  val BLAKE2B_288: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_296")
  @js.native
  val BLAKE2B_296: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_304")
  @js.native
  val BLAKE2B_304: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_312")
  @js.native
  val BLAKE2B_312: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_32")
  @js.native
  val BLAKE2B_32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_320")
  @js.native
  val BLAKE2B_320: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_328")
  @js.native
  val BLAKE2B_328: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_336")
  @js.native
  val BLAKE2B_336: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_344")
  @js.native
  val BLAKE2B_344: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_352")
  @js.native
  val BLAKE2B_352: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_360")
  @js.native
  val BLAKE2B_360: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_368")
  @js.native
  val BLAKE2B_368: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_376")
  @js.native
  val BLAKE2B_376: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_384")
  @js.native
  val BLAKE2B_384: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_392")
  @js.native
  val BLAKE2B_392: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_40")
  @js.native
  val BLAKE2B_40: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_400")
  @js.native
  val BLAKE2B_400: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_408")
  @js.native
  val BLAKE2B_408: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_416")
  @js.native
  val BLAKE2B_416: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_424")
  @js.native
  val BLAKE2B_424: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_432")
  @js.native
  val BLAKE2B_432: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_440")
  @js.native
  val BLAKE2B_440: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_448")
  @js.native
  val BLAKE2B_448: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_456")
  @js.native
  val BLAKE2B_456: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_464")
  @js.native
  val BLAKE2B_464: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_472")
  @js.native
  val BLAKE2B_472: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_48")
  @js.native
  val BLAKE2B_48: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_480")
  @js.native
  val BLAKE2B_480: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_488")
  @js.native
  val BLAKE2B_488: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_496")
  @js.native
  val BLAKE2B_496: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_504")
  @js.native
  val BLAKE2B_504: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_512")
  @js.native
  val BLAKE2B_512: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_56")
  @js.native
  val BLAKE2B_56: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_64")
  @js.native
  val BLAKE2B_64: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_72")
  @js.native
  val BLAKE2B_72: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_8")
  @js.native
  val BLAKE2B_8: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_80")
  @js.native
  val BLAKE2B_80: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_88")
  @js.native
  val BLAKE2B_88: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_96")
  @js.native
  val BLAKE2B_96: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_104")
  @js.native
  val BLAKE2S_104: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_112")
  @js.native
  val BLAKE2S_112: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_120")
  @js.native
  val BLAKE2S_120: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_128")
  @js.native
  val BLAKE2S_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_136")
  @js.native
  val BLAKE2S_136: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_144")
  @js.native
  val BLAKE2S_144: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_152")
  @js.native
  val BLAKE2S_152: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_16")
  @js.native
  val BLAKE2S_16: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_160")
  @js.native
  val BLAKE2S_160: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_168")
  @js.native
  val BLAKE2S_168: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_176")
  @js.native
  val BLAKE2S_176: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_184")
  @js.native
  val BLAKE2S_184: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_192")
  @js.native
  val BLAKE2S_192: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_200")
  @js.native
  val BLAKE2S_200: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_208")
  @js.native
  val BLAKE2S_208: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_216")
  @js.native
  val BLAKE2S_216: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_224")
  @js.native
  val BLAKE2S_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_232")
  @js.native
  val BLAKE2S_232: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_24")
  @js.native
  val BLAKE2S_24: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_240")
  @js.native
  val BLAKE2S_240: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_248")
  @js.native
  val BLAKE2S_248: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_256")
  @js.native
  val BLAKE2S_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_32")
  @js.native
  val BLAKE2S_32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_40")
  @js.native
  val BLAKE2S_40: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_48")
  @js.native
  val BLAKE2S_48: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_56")
  @js.native
  val BLAKE2S_56: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_64")
  @js.native
  val BLAKE2S_64: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_72")
  @js.native
  val BLAKE2S_72: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_8")
  @js.native
  val BLAKE2S_8: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_80")
  @js.native
  val BLAKE2S_80: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_88")
  @js.native
  val BLAKE2S_88: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_96")
  @js.native
  val BLAKE2S_96: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE3")
  @js.native
  val BLAKE3: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLS12_381_G1G2_PUB")
  @js.native
  val BLS12_381_G1G2_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLS12_381_G1_PUB")
  @js.native
  val BLS12_381_G1_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLS12_381_G2_PUB")
  @js.native
  val BLS12_381_G2_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BMT")
  @js.native
  val BMT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CAIP_50")
  @js.native
  val CAIP_50: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CAR_INDEX_SORTED")
  @js.native
  val CAR_INDEX_SORTED: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CBOR")
  @js.native
  val CBOR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CIDV1")
  @js.native
  val CIDV1: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CIDV2")
  @js.native
  val CIDV2: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CIDV3")
  @js.native
  val CIDV3: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_CBOR")
  @js.native
  val DAG_CBOR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_COSE")
  @js.native
  val DAG_COSE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_JOSE")
  @js.native
  val DAG_JOSE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_JSON")
  @js.native
  val DAG_JSON: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_PB")
  @js.native
  val DAG_PB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DASH_BLOCK")
  @js.native
  val DASH_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DASH_TX")
  @js.native
  val DASH_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DBL_SHA2_256")
  @js.native
  val DBL_SHA2_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DCCP")
  @js.native
  val DCCP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DECRED_BLOCK")
  @js.native
  val DECRED_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DECRED_TX")
  @js.native
  val DECRED_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNS")
  @js.native
  val DNS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNS4")
  @js.native
  val DNS4: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNS6")
  @js.native
  val DNS6: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNSADDR")
  @js.native
  val DNSADDR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ED25519_PRIV")
  @js.native
  val ED25519_PRIV: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ED25519_PUB")
  @js.native
  val ED25519_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ED448_PUB")
  @js.native
  val ED448_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_ACCOUNT_SNAPSHOT")
  @js.native
  val ETH_ACCOUNT_SNAPSHOT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_BLOCK")
  @js.native
  val ETH_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_BLOCK_LIST")
  @js.native
  val ETH_BLOCK_LIST: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_RECEIPT_LOG_TRIE")
  @js.native
  val ETH_RECEIPT_LOG_TRIE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_RECIEPT_LOG")
  @js.native
  val ETH_RECIEPT_LOG: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_STATE_TRIE")
  @js.native
  val ETH_STATE_TRIE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_STORAGE_TRIE")
  @js.native
  val ETH_STORAGE_TRIE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX")
  @js.native
  val ETH_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX_RECEIPT")
  @js.native
  val ETH_TX_RECEIPT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX_RECEIPT_TRIE")
  @js.native
  val ETH_TX_RECEIPT_TRIE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX_TRIE")
  @js.native
  val ETH_TX_TRIE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "FIL_COMMITMENT_SEALED")
  @js.native
  val FIL_COMMITMENT_SEALED: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "FIL_COMMITMENT_UNSEALED")
  @js.native
  val FIL_COMMITMENT_UNSEALED: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "GARLIC32")
  @js.native
  val GARLIC32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "GARLIC64")
  @js.native
  val GARLIC64: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "GIT_RAW")
  @js.native
  val GIT_RAW: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_ADR_V0")
  @js.native
  val HOLOCHAIN_ADR_V0: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_ADR_V1")
  @js.native
  val HOLOCHAIN_ADR_V1: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_KEY_V0")
  @js.native
  val HOLOCHAIN_KEY_V0: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_KEY_V1")
  @js.native
  val HOLOCHAIN_KEY_V1: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_SIG_V0")
  @js.native
  val HOLOCHAIN_SIG_V0: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_SIG_V1")
  @js.native
  val HOLOCHAIN_SIG_V1: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HTTP")
  @js.native
  val HTTP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HTTPS")
  @js.native
  val HTTPS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IDENTITY")
  @js.native
  val IDENTITY: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IP4")
  @js.native
  val IP4: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IP6")
  @js.native
  val IP6: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IP6ZONE")
  @js.native
  val IP6ZONE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPFS")
  @js.native
  val IPFS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPFS_NS")
  @js.native
  val IPFS_NS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPLD_NS")
  @js.native
  val IPLD_NS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPNS_NS")
  @js.native
  val IPNS_NS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "JSON")
  @js.native
  val JSON: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KANGAROOTWELVE")
  @js.native
  val KANGAROOTWELVE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_224")
  @js.native
  val KECCAK_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_256")
  @js.native
  val KECCAK_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_384")
  @js.native
  val KECCAK_384: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_512")
  @js.native
  val KECCAK_512: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LEOFCOIN_BLOCK")
  @js.native
  val LEOFCOIN_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LEOFCOIN_PR")
  @js.native
  val LEOFCOIN_PR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LEOFCOIN_TX")
  @js.native
  val LEOFCOIN_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LIBP2P_KEY")
  @js.native
  val LIBP2P_KEY: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LIBP2P_PEER_RECORD")
  @js.native
  val LIBP2P_PEER_RECORD: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LIBP2P_RELAY_RSVP")
  @js.native
  val LIBP2P_RELAY_RSVP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MD4")
  @js.native
  val MD4: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MD5")
  @js.native
  val MD5: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MESSAGEPACK")
  @js.native
  val MESSAGEPACK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTIADDR")
  @js.native
  val MULTIADDR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTIBASE")
  @js.native
  val MULTIBASE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTICODEC")
  @js.native
  val MULTICODEC: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTIHASH")
  @js.native
  val MULTIHASH: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MURMUR3_128")
  @js.native
  val MURMUR3_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MURMUR3_32")
  @js.native
  val MURMUR3_32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "NOISE")
  @js.native
  val NOISE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ONION")
  @js.native
  val ONION: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ONION3")
  @js.native
  val ONION3: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P256_PUB")
  @js.native
  val P256_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P")
  @js.native
  val P2P: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_CIRCUIT")
  @js.native
  val P2P_CIRCUIT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_STARDUST")
  @js.native
  val P2P_STARDUST: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_WEBRTC_DIRECT")
  @js.native
  val P2P_WEBRTC_DIRECT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_WEBRTC_STAR")
  @js.native
  val P2P_WEBRTC_STAR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_WEBSOCKET_STAR")
  @js.native
  val P2P_WEBSOCKET_STAR: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P384_PUB")
  @js.native
  val P384_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P521_PUB")
  @js.native
  val P521_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "PATH")
  @js.native
  val PATH: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "POSEIDON_BLS12_381_A2_FC1")
  @js.native
  val POSEIDON_BLS12_381_A2_FC1: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "POSEIDON_BLS12_381_A2_FC1_SC")
  @js.native
  val POSEIDON_BLS12_381_A2_FC1_SC: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "PROTOBUF")
  @js.native
  val PROTOBUF: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "QUIC")
  @js.native
  val QUIC: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RAW")
  @js.native
  val RAW: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_128")
  @js.native
  val RIPEMD_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_160")
  @js.native
  val RIPEMD_160: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_256")
  @js.native
  val RIPEMD_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_320")
  @js.native
  val RIPEMD_320: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RLP")
  @js.native
  val RLP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SCTP")
  @js.native
  val SCTP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SECP256K1_PRIV")
  @js.native
  val SECP256K1_PRIV: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SECP256K1_PUB")
  @js.native
  val SECP256K1_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA1")
  @js.native
  val SHA1: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA2_256")
  @js.native
  val SHA2_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA2_256_TRUNC254_PADDED")
  @js.native
  val SHA2_256_TRUNC254_PADDED: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA2_512")
  @js.native
  val SHA2_512: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_224")
  @js.native
  val SHA3_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_256")
  @js.native
  val SHA3_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_384")
  @js.native
  val SHA3_384: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_512")
  @js.native
  val SHA3_512: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHAKE_128")
  @js.native
  val SHAKE_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHAKE_256")
  @js.native
  val SHAKE_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1000")
  @js.native
  val SKEIN1024_1000: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1008")
  @js.native
  val SKEIN1024_1008: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1016")
  @js.native
  val SKEIN1024_1016: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1024")
  @js.native
  val SKEIN1024_1024: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_104")
  @js.native
  val SKEIN1024_104: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_112")
  @js.native
  val SKEIN1024_112: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_120")
  @js.native
  val SKEIN1024_120: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_128")
  @js.native
  val SKEIN1024_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_136")
  @js.native
  val SKEIN1024_136: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_144")
  @js.native
  val SKEIN1024_144: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_152")
  @js.native
  val SKEIN1024_152: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_16")
  @js.native
  val SKEIN1024_16: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_160")
  @js.native
  val SKEIN1024_160: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_168")
  @js.native
  val SKEIN1024_168: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_176")
  @js.native
  val SKEIN1024_176: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_184")
  @js.native
  val SKEIN1024_184: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_192")
  @js.native
  val SKEIN1024_192: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_200")
  @js.native
  val SKEIN1024_200: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_208")
  @js.native
  val SKEIN1024_208: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_216")
  @js.native
  val SKEIN1024_216: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_224")
  @js.native
  val SKEIN1024_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_232")
  @js.native
  val SKEIN1024_232: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_24")
  @js.native
  val SKEIN1024_24: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_240")
  @js.native
  val SKEIN1024_240: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_248")
  @js.native
  val SKEIN1024_248: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_256")
  @js.native
  val SKEIN1024_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_264")
  @js.native
  val SKEIN1024_264: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_272")
  @js.native
  val SKEIN1024_272: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_280")
  @js.native
  val SKEIN1024_280: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_288")
  @js.native
  val SKEIN1024_288: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_296")
  @js.native
  val SKEIN1024_296: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_304")
  @js.native
  val SKEIN1024_304: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_312")
  @js.native
  val SKEIN1024_312: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_32")
  @js.native
  val SKEIN1024_32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_320")
  @js.native
  val SKEIN1024_320: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_328")
  @js.native
  val SKEIN1024_328: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_336")
  @js.native
  val SKEIN1024_336: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_344")
  @js.native
  val SKEIN1024_344: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_352")
  @js.native
  val SKEIN1024_352: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_360")
  @js.native
  val SKEIN1024_360: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_368")
  @js.native
  val SKEIN1024_368: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_376")
  @js.native
  val SKEIN1024_376: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_384")
  @js.native
  val SKEIN1024_384: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_392")
  @js.native
  val SKEIN1024_392: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_40")
  @js.native
  val SKEIN1024_40: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_400")
  @js.native
  val SKEIN1024_400: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_408")
  @js.native
  val SKEIN1024_408: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_416")
  @js.native
  val SKEIN1024_416: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_424")
  @js.native
  val SKEIN1024_424: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_432")
  @js.native
  val SKEIN1024_432: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_440")
  @js.native
  val SKEIN1024_440: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_448")
  @js.native
  val SKEIN1024_448: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_456")
  @js.native
  val SKEIN1024_456: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_464")
  @js.native
  val SKEIN1024_464: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_472")
  @js.native
  val SKEIN1024_472: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_48")
  @js.native
  val SKEIN1024_48: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_480")
  @js.native
  val SKEIN1024_480: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_488")
  @js.native
  val SKEIN1024_488: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_496")
  @js.native
  val SKEIN1024_496: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_504")
  @js.native
  val SKEIN1024_504: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_512")
  @js.native
  val SKEIN1024_512: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_520")
  @js.native
  val SKEIN1024_520: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_528")
  @js.native
  val SKEIN1024_528: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_536")
  @js.native
  val SKEIN1024_536: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_544")
  @js.native
  val SKEIN1024_544: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_552")
  @js.native
  val SKEIN1024_552: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_56")
  @js.native
  val SKEIN1024_56: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_560")
  @js.native
  val SKEIN1024_560: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_568")
  @js.native
  val SKEIN1024_568: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_576")
  @js.native
  val SKEIN1024_576: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_584")
  @js.native
  val SKEIN1024_584: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_592")
  @js.native
  val SKEIN1024_592: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_600")
  @js.native
  val SKEIN1024_600: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_608")
  @js.native
  val SKEIN1024_608: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_616")
  @js.native
  val SKEIN1024_616: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_624")
  @js.native
  val SKEIN1024_624: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_632")
  @js.native
  val SKEIN1024_632: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_64")
  @js.native
  val SKEIN1024_64: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_640")
  @js.native
  val SKEIN1024_640: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_648")
  @js.native
  val SKEIN1024_648: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_656")
  @js.native
  val SKEIN1024_656: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_664")
  @js.native
  val SKEIN1024_664: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_672")
  @js.native
  val SKEIN1024_672: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_680")
  @js.native
  val SKEIN1024_680: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_688")
  @js.native
  val SKEIN1024_688: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_696")
  @js.native
  val SKEIN1024_696: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_704")
  @js.native
  val SKEIN1024_704: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_712")
  @js.native
  val SKEIN1024_712: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_72")
  @js.native
  val SKEIN1024_72: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_720")
  @js.native
  val SKEIN1024_720: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_728")
  @js.native
  val SKEIN1024_728: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_736")
  @js.native
  val SKEIN1024_736: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_744")
  @js.native
  val SKEIN1024_744: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_752")
  @js.native
  val SKEIN1024_752: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_760")
  @js.native
  val SKEIN1024_760: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_768")
  @js.native
  val SKEIN1024_768: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_776")
  @js.native
  val SKEIN1024_776: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_784")
  @js.native
  val SKEIN1024_784: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_792")
  @js.native
  val SKEIN1024_792: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_8")
  @js.native
  val SKEIN1024_8: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_80")
  @js.native
  val SKEIN1024_80: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_800")
  @js.native
  val SKEIN1024_800: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_808")
  @js.native
  val SKEIN1024_808: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_816")
  @js.native
  val SKEIN1024_816: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_824")
  @js.native
  val SKEIN1024_824: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_832")
  @js.native
  val SKEIN1024_832: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_840")
  @js.native
  val SKEIN1024_840: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_848")
  @js.native
  val SKEIN1024_848: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_856")
  @js.native
  val SKEIN1024_856: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_864")
  @js.native
  val SKEIN1024_864: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_872")
  @js.native
  val SKEIN1024_872: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_88")
  @js.native
  val SKEIN1024_88: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_880")
  @js.native
  val SKEIN1024_880: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_888")
  @js.native
  val SKEIN1024_888: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_896")
  @js.native
  val SKEIN1024_896: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_904")
  @js.native
  val SKEIN1024_904: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_912")
  @js.native
  val SKEIN1024_912: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_920")
  @js.native
  val SKEIN1024_920: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_928")
  @js.native
  val SKEIN1024_928: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_936")
  @js.native
  val SKEIN1024_936: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_944")
  @js.native
  val SKEIN1024_944: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_952")
  @js.native
  val SKEIN1024_952: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_96")
  @js.native
  val SKEIN1024_96: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_960")
  @js.native
  val SKEIN1024_960: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_968")
  @js.native
  val SKEIN1024_968: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_976")
  @js.native
  val SKEIN1024_976: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_984")
  @js.native
  val SKEIN1024_984: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_992")
  @js.native
  val SKEIN1024_992: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_104")
  @js.native
  val SKEIN256_104: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_112")
  @js.native
  val SKEIN256_112: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_120")
  @js.native
  val SKEIN256_120: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_128")
  @js.native
  val SKEIN256_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_136")
  @js.native
  val SKEIN256_136: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_144")
  @js.native
  val SKEIN256_144: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_152")
  @js.native
  val SKEIN256_152: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_16")
  @js.native
  val SKEIN256_16: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_160")
  @js.native
  val SKEIN256_160: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_168")
  @js.native
  val SKEIN256_168: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_176")
  @js.native
  val SKEIN256_176: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_184")
  @js.native
  val SKEIN256_184: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_192")
  @js.native
  val SKEIN256_192: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_200")
  @js.native
  val SKEIN256_200: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_208")
  @js.native
  val SKEIN256_208: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_216")
  @js.native
  val SKEIN256_216: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_224")
  @js.native
  val SKEIN256_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_232")
  @js.native
  val SKEIN256_232: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_24")
  @js.native
  val SKEIN256_24: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_240")
  @js.native
  val SKEIN256_240: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_248")
  @js.native
  val SKEIN256_248: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_256")
  @js.native
  val SKEIN256_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_32")
  @js.native
  val SKEIN256_32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_40")
  @js.native
  val SKEIN256_40: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_48")
  @js.native
  val SKEIN256_48: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_56")
  @js.native
  val SKEIN256_56: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_64")
  @js.native
  val SKEIN256_64: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_72")
  @js.native
  val SKEIN256_72: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_8")
  @js.native
  val SKEIN256_8: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_80")
  @js.native
  val SKEIN256_80: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_88")
  @js.native
  val SKEIN256_88: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_96")
  @js.native
  val SKEIN256_96: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_104")
  @js.native
  val SKEIN512_104: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_112")
  @js.native
  val SKEIN512_112: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_120")
  @js.native
  val SKEIN512_120: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_128")
  @js.native
  val SKEIN512_128: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_136")
  @js.native
  val SKEIN512_136: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_144")
  @js.native
  val SKEIN512_144: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_152")
  @js.native
  val SKEIN512_152: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_16")
  @js.native
  val SKEIN512_16: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_160")
  @js.native
  val SKEIN512_160: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_168")
  @js.native
  val SKEIN512_168: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_176")
  @js.native
  val SKEIN512_176: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_184")
  @js.native
  val SKEIN512_184: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_192")
  @js.native
  val SKEIN512_192: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_200")
  @js.native
  val SKEIN512_200: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_208")
  @js.native
  val SKEIN512_208: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_216")
  @js.native
  val SKEIN512_216: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_224")
  @js.native
  val SKEIN512_224: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_232")
  @js.native
  val SKEIN512_232: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_24")
  @js.native
  val SKEIN512_24: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_240")
  @js.native
  val SKEIN512_240: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_248")
  @js.native
  val SKEIN512_248: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_256")
  @js.native
  val SKEIN512_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_264")
  @js.native
  val SKEIN512_264: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_272")
  @js.native
  val SKEIN512_272: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_280")
  @js.native
  val SKEIN512_280: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_288")
  @js.native
  val SKEIN512_288: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_296")
  @js.native
  val SKEIN512_296: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_304")
  @js.native
  val SKEIN512_304: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_312")
  @js.native
  val SKEIN512_312: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_32")
  @js.native
  val SKEIN512_32: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_320")
  @js.native
  val SKEIN512_320: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_328")
  @js.native
  val SKEIN512_328: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_336")
  @js.native
  val SKEIN512_336: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_344")
  @js.native
  val SKEIN512_344: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_352")
  @js.native
  val SKEIN512_352: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_360")
  @js.native
  val SKEIN512_360: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_368")
  @js.native
  val SKEIN512_368: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_376")
  @js.native
  val SKEIN512_376: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_384")
  @js.native
  val SKEIN512_384: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_392")
  @js.native
  val SKEIN512_392: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_40")
  @js.native
  val SKEIN512_40: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_400")
  @js.native
  val SKEIN512_400: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_408")
  @js.native
  val SKEIN512_408: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_416")
  @js.native
  val SKEIN512_416: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_424")
  @js.native
  val SKEIN512_424: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_432")
  @js.native
  val SKEIN512_432: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_440")
  @js.native
  val SKEIN512_440: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_448")
  @js.native
  val SKEIN512_448: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_456")
  @js.native
  val SKEIN512_456: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_464")
  @js.native
  val SKEIN512_464: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_472")
  @js.native
  val SKEIN512_472: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_48")
  @js.native
  val SKEIN512_48: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_480")
  @js.native
  val SKEIN512_480: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_488")
  @js.native
  val SKEIN512_488: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_496")
  @js.native
  val SKEIN512_496: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_504")
  @js.native
  val SKEIN512_504: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_512")
  @js.native
  val SKEIN512_512: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_56")
  @js.native
  val SKEIN512_56: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_64")
  @js.native
  val SKEIN512_64: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_72")
  @js.native
  val SKEIN512_72: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_8")
  @js.native
  val SKEIN512_8: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_80")
  @js.native
  val SKEIN512_80: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_88")
  @js.native
  val SKEIN512_88: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_96")
  @js.native
  val SKEIN512_96: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKYNET_NS")
  @js.native
  val SKYNET_NS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SM3_256")
  @js.native
  val SM3_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "STELLAR_BLOCK")
  @js.native
  val STELLAR_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "STELLAR_TX")
  @js.native
  val STELLAR_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "STREAMID")
  @js.native
  val STREAMID: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWARM_FEED")
  @js.native
  val SWARM_FEED: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWARM_MANIFEST")
  @js.native
  val SWARM_MANIFEST: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWARM_NS")
  @js.native
  val SWARM_NS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWHID_1_SNP")
  @js.native
  val SWHID_1_SNP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TCP")
  @js.native
  val TCP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "THREAD")
  @js.native
  val THREAD: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TLS")
  @js.native
  val TLS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TORRENT_FILE")
  @js.native
  val TORRENT_FILE: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TORRENT_INFO")
  @js.native
  val TORRENT_INFO: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UDP")
  @js.native
  val UDP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UDT")
  @js.native
  val UDT: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UNIX")
  @js.native
  val UNIX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UTP")
  @js.native
  val UTP: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "WS")
  @js.native
  val WS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "WSS")
  @js.native
  val WSS: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X11")
  @js.native
  val X11: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X25519_PRIV")
  @js.native
  val X25519_PRIV: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X25519_PUB")
  @js.native
  val X25519_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X448_PUB")
  @js.native
  val X448_PUB: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZCASH_BLOCK")
  @js.native
  val ZCASH_BLOCK: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZCASH_TX")
  @js.native
  val ZCASH_TX: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZERONET")
  @js.native
  val ZERONET: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZEROXCERT_IMPRINT_256")
  @js.native
  val ZEROXCERT_IMPRINT_256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  
  inline def addPrefix(multicodecStrOrCode: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrefix")(multicodecStrOrCode.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def addPrefix(multicodecStrOrCode: CodecName, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrefix")(multicodecStrOrCode.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("multicodec", "codeToName")
  @js.native
  val codeToName: CodeNameMap = js.native
  
  inline def getCode(prefixedData: js.typedarray.Uint8Array): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getCodeFromData(prefixedData: js.typedarray.Uint8Array): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeFromData")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getCodeFromName(name: CodecName): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeFromName")(name.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getCodeVarint(name: CodecName): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeVarint")(name.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getCodec(prefixedData: js.typedarray.Uint8Array): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodec")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getName(codec: CodecCode): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(codec.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getNameFromCode(codec: CodecCode): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromCode")(codec.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getNameFromData(prefixedData: js.typedarray.Uint8Array): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromData")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getNumber(name: CodecName): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(name.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getVarint(code: CodecCode): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVarint")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getVarintFromCode(code: CodecCode): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getVarintFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getVarintFromName(name: CodecName): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getVarintFromName")(name.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /* Inlined std.Readonly<std.Record<multicodec.multicodec/dist/src/generated-types.CodecName, multicodec.multicodec/dist/src/generated-types.CodecCode>> */
  object nameToCode {
    
    @JSImport("multicodec", "nameToCode.arweave-ns")
    @js.native
    val arweaveNs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bencode")
    @js.native
    val bencode: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bitcoin-block")
    @js.native
    val bitcoinBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bitcoin-tx")
    @js.native
    val bitcoinTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bitcoin-witness-commitment")
    @js.native
    val bitcoinWitnessCommitment: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-104")
    @js.native
    val blake2b104: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-112")
    @js.native
    val blake2b112: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-120")
    @js.native
    val blake2b120: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-128")
    @js.native
    val blake2b128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-136")
    @js.native
    val blake2b136: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-144")
    @js.native
    val blake2b144: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-152")
    @js.native
    val blake2b152: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-16")
    @js.native
    val blake2b16: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-160")
    @js.native
    val blake2b160: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-168")
    @js.native
    val blake2b168: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-176")
    @js.native
    val blake2b176: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-184")
    @js.native
    val blake2b184: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-192")
    @js.native
    val blake2b192: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-200")
    @js.native
    val blake2b200: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-208")
    @js.native
    val blake2b208: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-216")
    @js.native
    val blake2b216: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-224")
    @js.native
    val blake2b224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-232")
    @js.native
    val blake2b232: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-24")
    @js.native
    val blake2b24: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-240")
    @js.native
    val blake2b240: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-248")
    @js.native
    val blake2b248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-256")
    @js.native
    val blake2b256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-264")
    @js.native
    val blake2b264: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-272")
    @js.native
    val blake2b272: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-280")
    @js.native
    val blake2b280: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-288")
    @js.native
    val blake2b288: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-296")
    @js.native
    val blake2b296: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-304")
    @js.native
    val blake2b304: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-312")
    @js.native
    val blake2b312: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-32")
    @js.native
    val blake2b32: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-320")
    @js.native
    val blake2b320: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-328")
    @js.native
    val blake2b328: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-336")
    @js.native
    val blake2b336: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-344")
    @js.native
    val blake2b344: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-352")
    @js.native
    val blake2b352: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-360")
    @js.native
    val blake2b360: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-368")
    @js.native
    val blake2b368: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-376")
    @js.native
    val blake2b376: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-384")
    @js.native
    val blake2b384: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-392")
    @js.native
    val blake2b392: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-40")
    @js.native
    val blake2b40: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-400")
    @js.native
    val blake2b400: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-408")
    @js.native
    val blake2b408: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-416")
    @js.native
    val blake2b416: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-424")
    @js.native
    val blake2b424: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-432")
    @js.native
    val blake2b432: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-440")
    @js.native
    val blake2b440: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-448")
    @js.native
    val blake2b448: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-456")
    @js.native
    val blake2b456: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-464")
    @js.native
    val blake2b464: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-472")
    @js.native
    val blake2b472: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-48")
    @js.native
    val blake2b48: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-480")
    @js.native
    val blake2b480: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-488")
    @js.native
    val blake2b488: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-496")
    @js.native
    val blake2b496: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-504")
    @js.native
    val blake2b504: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-512")
    @js.native
    val blake2b512: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-56")
    @js.native
    val blake2b56: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-64")
    @js.native
    val blake2b64: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-72")
    @js.native
    val blake2b72: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-8")
    @js.native
    val blake2b8: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-80")
    @js.native
    val blake2b80: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-88")
    @js.native
    val blake2b88: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-96")
    @js.native
    val blake2b96: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-104")
    @js.native
    val blake2s104: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-112")
    @js.native
    val blake2s112: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-120")
    @js.native
    val blake2s120: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-128")
    @js.native
    val blake2s128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-136")
    @js.native
    val blake2s136: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-144")
    @js.native
    val blake2s144: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-152")
    @js.native
    val blake2s152: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-16")
    @js.native
    val blake2s16: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-160")
    @js.native
    val blake2s160: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-168")
    @js.native
    val blake2s168: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-176")
    @js.native
    val blake2s176: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-184")
    @js.native
    val blake2s184: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-192")
    @js.native
    val blake2s192: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-200")
    @js.native
    val blake2s200: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-208")
    @js.native
    val blake2s208: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-216")
    @js.native
    val blake2s216: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-224")
    @js.native
    val blake2s224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-232")
    @js.native
    val blake2s232: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-24")
    @js.native
    val blake2s24: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-240")
    @js.native
    val blake2s240: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-248")
    @js.native
    val blake2s248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-256")
    @js.native
    val blake2s256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-32")
    @js.native
    val blake2s32: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-40")
    @js.native
    val blake2s40: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-48")
    @js.native
    val blake2s48: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-56")
    @js.native
    val blake2s56: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-64")
    @js.native
    val blake2s64: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-72")
    @js.native
    val blake2s72: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-8")
    @js.native
    val blake2s8: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-80")
    @js.native
    val blake2s80: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-88")
    @js.native
    val blake2s88: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-96")
    @js.native
    val blake2s96: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake3")
    @js.native
    val blake3: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bls12_381-g1-pub")
    @js.native
    val bls12381G1Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bls12_381-g1g2-pub")
    @js.native
    val bls12381G1g2Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bls12_381-g2-pub")
    @js.native
    val bls12381G2Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bmt")
    @js.native
    val bmt: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.caip-50")
    @js.native
    val caip50: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.car-index-sorted")
    @js.native
    val carIndexSorted: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cbor")
    @js.native
    val cbor: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cidv1")
    @js.native
    val cidv1: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cidv2")
    @js.native
    val cidv2: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cidv3")
    @js.native
    val cidv3: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-cbor")
    @js.native
    val dagCbor: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-cose")
    @js.native
    val dagCose: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-jose")
    @js.native
    val dagJose: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-json")
    @js.native
    val dagJson: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-pb")
    @js.native
    val dagPb: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dash-block")
    @js.native
    val dashBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dash-tx")
    @js.native
    val dashTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dbl-sha2-256")
    @js.native
    val dblSha2256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dccp")
    @js.native
    val dccp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.decred-block")
    @js.native
    val decredBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.decred-tx")
    @js.native
    val decredTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dns")
    @js.native
    val dns: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dns4")
    @js.native
    val dns4: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dns6")
    @js.native
    val dns6: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dnsaddr")
    @js.native
    val dnsaddr: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ed25519-priv")
    @js.native
    val ed25519Priv: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ed25519-pub")
    @js.native
    val ed25519Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ed448-pub")
    @js.native
    val ed448Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-account-snapshot")
    @js.native
    val ethAccountSnapshot: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-block")
    @js.native
    val ethBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-block-list")
    @js.native
    val ethBlockList: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-receipt-log-trie")
    @js.native
    val ethReceiptLogTrie: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-reciept-log")
    @js.native
    val ethRecieptLog: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-state-trie")
    @js.native
    val ethStateTrie: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-storage-trie")
    @js.native
    val ethStorageTrie: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx")
    @js.native
    val ethTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx-receipt")
    @js.native
    val ethTxReceipt: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx-receipt-trie")
    @js.native
    val ethTxReceiptTrie: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx-trie")
    @js.native
    val ethTxTrie: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.fil-commitment-sealed")
    @js.native
    val filCommitmentSealed: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.fil-commitment-unsealed")
    @js.native
    val filCommitmentUnsealed: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.garlic32")
    @js.native
    val garlic32: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.garlic64")
    @js.native
    val garlic64: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.git-raw")
    @js.native
    val gitRaw: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-adr-v0")
    @js.native
    val holochainAdrV0: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-adr-v1")
    @js.native
    val holochainAdrV1: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-key-v0")
    @js.native
    val holochainKeyV0: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-key-v1")
    @js.native
    val holochainKeyV1: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-sig-v0")
    @js.native
    val holochainSigV0: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-sig-v1")
    @js.native
    val holochainSigV1: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.http")
    @js.native
    val http: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.https")
    @js.native
    val https: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.identity")
    @js.native
    val identity: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ip4")
    @js.native
    val ip4: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ip6")
    @js.native
    val ip6: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ip6zone")
    @js.native
    val ip6zone: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipfs")
    @js.native
    val ipfs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipfs-ns")
    @js.native
    val ipfsNs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipld-ns")
    @js.native
    val ipldNs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipns-ns")
    @js.native
    val ipnsNs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.json")
    @js.native
    val json: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.kangarootwelve")
    @js.native
    val kangarootwelve: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-224")
    @js.native
    val keccak224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-256")
    @js.native
    val keccak256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-384")
    @js.native
    val keccak384: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-512")
    @js.native
    val keccak512: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.leofcoin-block")
    @js.native
    val leofcoinBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.leofcoin-pr")
    @js.native
    val leofcoinPr: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.leofcoin-tx")
    @js.native
    val leofcoinTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.libp2p-key")
    @js.native
    val libp2pKey: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.libp2p-peer-record")
    @js.native
    val libp2pPeerRecord: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.libp2p-relay-rsvp")
    @js.native
    val libp2pRelayRsvp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.md4")
    @js.native
    val md4: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.md5")
    @js.native
    val md5: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.messagepack")
    @js.native
    val messagepack: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multiaddr")
    @js.native
    val multiaddr: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multibase")
    @js.native
    val multibase: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multicodec")
    @js.native
    val multicodec: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multihash")
    @js.native
    val multihash: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.murmur3-128")
    @js.native
    val murmur3128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.murmur3-32")
    @js.native
    val murmur332: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.noise")
    @js.native
    val noise: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.onion")
    @js.native
    val onion: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.onion3")
    @js.native
    val onion3: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p256-pub")
    @js.native
    val p256Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p")
    @js.native
    val p2p: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-circuit")
    @js.native
    val p2pCircuit: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-stardust")
    @js.native
    val p2pStardust: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-webrtc-direct")
    @js.native
    val p2pWebrtcDirect: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-webrtc-star")
    @js.native
    val p2pWebrtcStar: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-websocket-star")
    @js.native
    val p2pWebsocketStar: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p384-pub")
    @js.native
    val p384Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p521-pub")
    @js.native
    val p521Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.path")
    @js.native
    val path: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.poseidon-bls12_381-a2-fc1")
    @js.native
    val poseidonBls12381A2Fc1: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.poseidon-bls12_381-a2-fc1-sc")
    @js.native
    val poseidonBls12381A2Fc1Sc: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.protobuf")
    @js.native
    val protobuf: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.quic")
    @js.native
    val quic: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.raw")
    @js.native
    val raw: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-128")
    @js.native
    val ripemd128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-160")
    @js.native
    val ripemd160: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-256")
    @js.native
    val ripemd256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-320")
    @js.native
    val ripemd320: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.rlp")
    @js.native
    val rlp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sctp")
    @js.native
    val sctp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.secp256k1-priv")
    @js.native
    val secp256k1Priv: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.secp256k1-pub")
    @js.native
    val secp256k1Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha1")
    @js.native
    val sha1: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha2-256")
    @js.native
    val sha2256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha2-256-trunc254-padded")
    @js.native
    val sha2256Trunc254Padded: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha2-512")
    @js.native
    val sha2512: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-224")
    @js.native
    val sha3224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-256")
    @js.native
    val sha3256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-384")
    @js.native
    val sha3384: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-512")
    @js.native
    val sha3512: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.shake-128")
    @js.native
    val shake128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.shake-256")
    @js.native
    val shake256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1000")
    @js.native
    val skein10241000: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1008")
    @js.native
    val skein10241008: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1016")
    @js.native
    val skein10241016: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1024")
    @js.native
    val skein10241024: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-104")
    @js.native
    val skein1024104: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-112")
    @js.native
    val skein1024112: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-120")
    @js.native
    val skein1024120: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-128")
    @js.native
    val skein1024128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-136")
    @js.native
    val skein1024136: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-144")
    @js.native
    val skein1024144: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-152")
    @js.native
    val skein1024152: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-16")
    @js.native
    val skein102416: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-160")
    @js.native
    val skein1024160: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-168")
    @js.native
    val skein1024168: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-176")
    @js.native
    val skein1024176: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-184")
    @js.native
    val skein1024184: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-192")
    @js.native
    val skein1024192: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-200")
    @js.native
    val skein1024200: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-208")
    @js.native
    val skein1024208: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-216")
    @js.native
    val skein1024216: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-224")
    @js.native
    val skein1024224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-232")
    @js.native
    val skein1024232: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-24")
    @js.native
    val skein102424: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-240")
    @js.native
    val skein1024240: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-248")
    @js.native
    val skein1024248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-256")
    @js.native
    val skein1024256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-264")
    @js.native
    val skein1024264: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-272")
    @js.native
    val skein1024272: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-280")
    @js.native
    val skein1024280: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-288")
    @js.native
    val skein1024288: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-296")
    @js.native
    val skein1024296: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-304")
    @js.native
    val skein1024304: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-312")
    @js.native
    val skein1024312: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-32")
    @js.native
    val skein102432: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-320")
    @js.native
    val skein1024320: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-328")
    @js.native
    val skein1024328: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-336")
    @js.native
    val skein1024336: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-344")
    @js.native
    val skein1024344: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-352")
    @js.native
    val skein1024352: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-360")
    @js.native
    val skein1024360: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-368")
    @js.native
    val skein1024368: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-376")
    @js.native
    val skein1024376: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-384")
    @js.native
    val skein1024384: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-392")
    @js.native
    val skein1024392: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-40")
    @js.native
    val skein102440: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-400")
    @js.native
    val skein1024400: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-408")
    @js.native
    val skein1024408: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-416")
    @js.native
    val skein1024416: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-424")
    @js.native
    val skein1024424: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-432")
    @js.native
    val skein1024432: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-440")
    @js.native
    val skein1024440: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-448")
    @js.native
    val skein1024448: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-456")
    @js.native
    val skein1024456: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-464")
    @js.native
    val skein1024464: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-472")
    @js.native
    val skein1024472: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-48")
    @js.native
    val skein102448: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-480")
    @js.native
    val skein1024480: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-488")
    @js.native
    val skein1024488: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-496")
    @js.native
    val skein1024496: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-504")
    @js.native
    val skein1024504: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-512")
    @js.native
    val skein1024512: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-520")
    @js.native
    val skein1024520: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-528")
    @js.native
    val skein1024528: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-536")
    @js.native
    val skein1024536: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-544")
    @js.native
    val skein1024544: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-552")
    @js.native
    val skein1024552: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-56")
    @js.native
    val skein102456: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-560")
    @js.native
    val skein1024560: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-568")
    @js.native
    val skein1024568: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-576")
    @js.native
    val skein1024576: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-584")
    @js.native
    val skein1024584: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-592")
    @js.native
    val skein1024592: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-600")
    @js.native
    val skein1024600: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-608")
    @js.native
    val skein1024608: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-616")
    @js.native
    val skein1024616: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-624")
    @js.native
    val skein1024624: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-632")
    @js.native
    val skein1024632: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-64")
    @js.native
    val skein102464: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-640")
    @js.native
    val skein1024640: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-648")
    @js.native
    val skein1024648: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-656")
    @js.native
    val skein1024656: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-664")
    @js.native
    val skein1024664: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-672")
    @js.native
    val skein1024672: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-680")
    @js.native
    val skein1024680: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-688")
    @js.native
    val skein1024688: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-696")
    @js.native
    val skein1024696: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-704")
    @js.native
    val skein1024704: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-712")
    @js.native
    val skein1024712: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-72")
    @js.native
    val skein102472: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-720")
    @js.native
    val skein1024720: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-728")
    @js.native
    val skein1024728: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-736")
    @js.native
    val skein1024736: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-744")
    @js.native
    val skein1024744: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-752")
    @js.native
    val skein1024752: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-760")
    @js.native
    val skein1024760: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-768")
    @js.native
    val skein1024768: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-776")
    @js.native
    val skein1024776: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-784")
    @js.native
    val skein1024784: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-792")
    @js.native
    val skein1024792: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-8")
    @js.native
    val skein10248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-80")
    @js.native
    val skein102480: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-800")
    @js.native
    val skein1024800: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-808")
    @js.native
    val skein1024808: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-816")
    @js.native
    val skein1024816: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-824")
    @js.native
    val skein1024824: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-832")
    @js.native
    val skein1024832: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-840")
    @js.native
    val skein1024840: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-848")
    @js.native
    val skein1024848: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-856")
    @js.native
    val skein1024856: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-864")
    @js.native
    val skein1024864: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-872")
    @js.native
    val skein1024872: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-88")
    @js.native
    val skein102488: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-880")
    @js.native
    val skein1024880: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-888")
    @js.native
    val skein1024888: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-896")
    @js.native
    val skein1024896: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-904")
    @js.native
    val skein1024904: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-912")
    @js.native
    val skein1024912: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-920")
    @js.native
    val skein1024920: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-928")
    @js.native
    val skein1024928: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-936")
    @js.native
    val skein1024936: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-944")
    @js.native
    val skein1024944: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-952")
    @js.native
    val skein1024952: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-96")
    @js.native
    val skein102496: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-960")
    @js.native
    val skein1024960: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-968")
    @js.native
    val skein1024968: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-976")
    @js.native
    val skein1024976: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-984")
    @js.native
    val skein1024984: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-992")
    @js.native
    val skein1024992: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-104")
    @js.native
    val skein256104: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-112")
    @js.native
    val skein256112: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-120")
    @js.native
    val skein256120: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-128")
    @js.native
    val skein256128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-136")
    @js.native
    val skein256136: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-144")
    @js.native
    val skein256144: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-152")
    @js.native
    val skein256152: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-16")
    @js.native
    val skein25616: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-160")
    @js.native
    val skein256160: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-168")
    @js.native
    val skein256168: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-176")
    @js.native
    val skein256176: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-184")
    @js.native
    val skein256184: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-192")
    @js.native
    val skein256192: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-200")
    @js.native
    val skein256200: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-208")
    @js.native
    val skein256208: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-216")
    @js.native
    val skein256216: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-224")
    @js.native
    val skein256224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-232")
    @js.native
    val skein256232: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-24")
    @js.native
    val skein25624: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-240")
    @js.native
    val skein256240: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-248")
    @js.native
    val skein256248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-256")
    @js.native
    val skein256256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-32")
    @js.native
    val skein25632: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-40")
    @js.native
    val skein25640: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-48")
    @js.native
    val skein25648: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-56")
    @js.native
    val skein25656: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-64")
    @js.native
    val skein25664: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-72")
    @js.native
    val skein25672: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-8")
    @js.native
    val skein2568: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-80")
    @js.native
    val skein25680: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-88")
    @js.native
    val skein25688: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-96")
    @js.native
    val skein25696: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-104")
    @js.native
    val skein512104: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-112")
    @js.native
    val skein512112: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-120")
    @js.native
    val skein512120: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-128")
    @js.native
    val skein512128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-136")
    @js.native
    val skein512136: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-144")
    @js.native
    val skein512144: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-152")
    @js.native
    val skein512152: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-16")
    @js.native
    val skein51216: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-160")
    @js.native
    val skein512160: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-168")
    @js.native
    val skein512168: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-176")
    @js.native
    val skein512176: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-184")
    @js.native
    val skein512184: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-192")
    @js.native
    val skein512192: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-200")
    @js.native
    val skein512200: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-208")
    @js.native
    val skein512208: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-216")
    @js.native
    val skein512216: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-224")
    @js.native
    val skein512224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-232")
    @js.native
    val skein512232: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-24")
    @js.native
    val skein51224: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-240")
    @js.native
    val skein512240: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-248")
    @js.native
    val skein512248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-256")
    @js.native
    val skein512256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-264")
    @js.native
    val skein512264: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-272")
    @js.native
    val skein512272: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-280")
    @js.native
    val skein512280: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-288")
    @js.native
    val skein512288: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-296")
    @js.native
    val skein512296: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-304")
    @js.native
    val skein512304: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-312")
    @js.native
    val skein512312: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-32")
    @js.native
    val skein51232: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-320")
    @js.native
    val skein512320: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-328")
    @js.native
    val skein512328: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-336")
    @js.native
    val skein512336: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-344")
    @js.native
    val skein512344: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-352")
    @js.native
    val skein512352: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-360")
    @js.native
    val skein512360: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-368")
    @js.native
    val skein512368: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-376")
    @js.native
    val skein512376: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-384")
    @js.native
    val skein512384: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-392")
    @js.native
    val skein512392: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-40")
    @js.native
    val skein51240: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-400")
    @js.native
    val skein512400: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-408")
    @js.native
    val skein512408: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-416")
    @js.native
    val skein512416: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-424")
    @js.native
    val skein512424: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-432")
    @js.native
    val skein512432: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-440")
    @js.native
    val skein512440: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-448")
    @js.native
    val skein512448: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-456")
    @js.native
    val skein512456: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-464")
    @js.native
    val skein512464: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-472")
    @js.native
    val skein512472: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-48")
    @js.native
    val skein51248: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-480")
    @js.native
    val skein512480: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-488")
    @js.native
    val skein512488: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-496")
    @js.native
    val skein512496: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-504")
    @js.native
    val skein512504: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-512")
    @js.native
    val skein512512: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-56")
    @js.native
    val skein51256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-64")
    @js.native
    val skein51264: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-72")
    @js.native
    val skein51272: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-8")
    @js.native
    val skein5128: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-80")
    @js.native
    val skein51280: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-88")
    @js.native
    val skein51288: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-96")
    @js.native
    val skein51296: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skynet-ns")
    @js.native
    val skynetNs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sm3-256")
    @js.native
    val sm3256: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.stellar-block")
    @js.native
    val stellarBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.stellar-tx")
    @js.native
    val stellarTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.streamid")
    @js.native
    val streamid: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swarm-feed")
    @js.native
    val swarmFeed: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swarm-manifest")
    @js.native
    val swarmManifest: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swarm-ns")
    @js.native
    val swarmNs: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swhid-1-snp")
    @js.native
    val swhid1Snp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.tcp")
    @js.native
    val tcp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.thread")
    @js.native
    val thread: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.tls")
    @js.native
    val tls: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.torrent-file")
    @js.native
    val torrentFile: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.torrent-info")
    @js.native
    val torrentInfo: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.udp")
    @js.native
    val udp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.udt")
    @js.native
    val udt: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.unix")
    @js.native
    val unix: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.utp")
    @js.native
    val utp: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ws")
    @js.native
    val ws: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.wss")
    @js.native
    val wss: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x11")
    @js.native
    val x11: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x25519-priv")
    @js.native
    val x25519Priv: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x25519-pub")
    @js.native
    val x25519Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x448-pub")
    @js.native
    val x448Pub: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zcash-block")
    @js.native
    val zcashBlock: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zcash-tx")
    @js.native
    val zcashTx: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zeronet")
    @js.native
    val zeronet: typings.multicodec.generatedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zeroxcert-imprint-256")
    @js.native
    val zeroxcertImprint256: typings.multicodec.generatedTypesMod.CodecCode = js.native
  }
  
  @JSImport("multicodec", "nameToVarint")
  @js.native
  val nameToVarint: NameUint8ArrayMap = js.native
  
  inline def rmPrefix(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("rmPrefix")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /* Rewritten from type alias, can be one of: 
    - typings.multicodec.multicodecNumbers.`0`
    - typings.multicodec.multicodecNumbers.`1`
    - typings.multicodec.multicodecNumbers.`2`
    - typings.multicodec.multicodecNumbers.`3`
    - typings.multicodec.multicodecNumbers.`4`
    - typings.multicodec.multicodecNumbers.`6`
    - typings.multicodec.multicodecNumbers.`17`
    - typings.multicodec.multicodecNumbers.`18`
    - typings.multicodec.multicodecNumbers.`19`
    - typings.multicodec.multicodecNumbers.`20`
    - typings.multicodec.multicodecNumbers.`21`
    - typings.multicodec.multicodecNumbers.`22`
    - typings.multicodec.multicodecNumbers.`23`
    - typings.multicodec.multicodecNumbers.`24`
    - typings.multicodec.multicodecNumbers.`25`
    - typings.multicodec.multicodecNumbers.`26`
    - typings.multicodec.multicodecNumbers.`27`
    - typings.multicodec.multicodecNumbers.`28`
    - typings.multicodec.multicodecNumbers.`29`
    - typings.multicodec.multicodecNumbers.`30`
    - typings.multicodec.multicodecNumbers.`33`
    - typings.multicodec.multicodecNumbers.`34`
    - typings.multicodec.multicodecNumbers.`35`
    - typings.multicodec.multicodecNumbers.`41`
    - typings.multicodec.multicodecNumbers.`42`
    - typings.multicodec.multicodecNumbers.`47`
    - typings.multicodec.multicodecNumbers.`48`
    - typings.multicodec.multicodecNumbers.`49`
    - typings.multicodec.multicodecNumbers.`50`
    - typings.multicodec.multicodecNumbers.`51`
    - typings.multicodec.multicodecNumbers.`53`
    - typings.multicodec.multicodecNumbers.`54`
    - typings.multicodec.multicodecNumbers.`55`
    - typings.multicodec.multicodecNumbers.`56`
    - typings.multicodec.multicodecNumbers.`80`
    - typings.multicodec.multicodecNumbers.`81`
    - typings.multicodec.multicodecNumbers.`85`
    - typings.multicodec.multicodecNumbers.`86`
    - typings.multicodec.multicodecNumbers.`96`
    - typings.multicodec.multicodecNumbers.`99`
    - typings.multicodec.multicodecNumbers.`112`
    - typings.multicodec.multicodecNumbers.`113`
    - typings.multicodec.multicodecNumbers.`114`
    - typings.multicodec.multicodecNumbers.`120`
    - typings.multicodec.multicodecNumbers.`123`
    - typings.multicodec.multicodecNumbers.`124`
    - typings.multicodec.multicodecNumbers.`129`
    - typings.multicodec.multicodecNumbers.`130`
    - typings.multicodec.multicodecNumbers.`131`
    - typings.multicodec.multicodecNumbers.`132`
    - typings.multicodec.multicodecNumbers.`133`
    - typings.multicodec.multicodecNumbers.`134`
    - typings.multicodec.multicodecNumbers.`144`
    - typings.multicodec.multicodecNumbers.`145`
    - typings.multicodec.multicodecNumbers.`146`
    - typings.multicodec.multicodecNumbers.`147`
    - typings.multicodec.multicodecNumbers.`148`
    - typings.multicodec.multicodecNumbers.`149`
    - typings.multicodec.multicodecNumbers.`150`
    - typings.multicodec.multicodecNumbers.`151`
    - typings.multicodec.multicodecNumbers.`152`
    - typings.multicodec.multicodecNumbers.`153`
    - typings.multicodec.multicodecNumbers.`154`
    - typings.multicodec.multicodecNumbers.`176`
    - typings.multicodec.multicodecNumbers.`177`
    - typings.multicodec.multicodecNumbers.`178`
    - typings.multicodec.multicodecNumbers.`192`
    - typings.multicodec.multicodecNumbers.`193`
    - typings.multicodec.multicodecNumbers.`202`
    - typings.multicodec.multicodecNumbers.`206`
    - typings.multicodec.multicodecNumbers.`208`
    - typings.multicodec.multicodecNumbers.`209`
    - typings.multicodec.multicodecNumbers.`212`
    - typings.multicodec.multicodecNumbers.`213`
    - typings.multicodec.multicodecNumbers.`214`
    - typings.multicodec.multicodecNumbers.`224`
    - typings.multicodec.multicodecNumbers.`225`
    - typings.multicodec.multicodecNumbers.`226`
    - typings.multicodec.multicodecNumbers.`227`
    - typings.multicodec.multicodecNumbers.`228`
    - typings.multicodec.multicodecNumbers.`229`
    - typings.multicodec.multicodecNumbers.`230`
    - typings.multicodec.multicodecNumbers.`231`
    - typings.multicodec.multicodecNumbers.`234`
    - typings.multicodec.multicodecNumbers.`235`
    - typings.multicodec.multicodecNumbers.`236`
    - typings.multicodec.multicodecNumbers.`237`
    - typings.multicodec.multicodecNumbers.`238`
    - typings.multicodec.multicodecNumbers.`240`
    - typings.multicodec.multicodecNumbers.`241`
    - typings.multicodec.multicodecNumbers.`250`
    - typings.multicodec.multicodecNumbers.`251`
    - typings.multicodec.multicodecNumbers.`273`
    - typings.multicodec.multicodecNumbers.`275`
    - typings.multicodec.multicodecNumbers.`276`
    - typings.multicodec.multicodecNumbers.`277`
    - typings.multicodec.multicodecNumbers.`290`
    - typings.multicodec.multicodecNumbers.`297`
    - typings.multicodec.multicodecNumbers.`301`
    - typings.multicodec.multicodecNumbers.`302`
    - typings.multicodec.multicodecNumbers.`400`
    - typings.multicodec.multicodecNumbers.`406`
    - typings.multicodec.multicodecNumbers.`421`
    - typings.multicodec.multicodecNumbers.`443`
    - typings.multicodec.multicodecNumbers.`444`
    - typings.multicodec.multicodecNumbers.`445`
    - typings.multicodec.multicodecNumbers.`446`
    - typings.multicodec.multicodecNumbers.`447`
    - typings.multicodec.multicodecNumbers.`448`
    - typings.multicodec.multicodecNumbers.`454`
    - typings.multicodec.multicodecNumbers.`460`
    - typings.multicodec.multicodecNumbers.`477`
    - typings.multicodec.multicodecNumbers.`478`
    - typings.multicodec.multicodecNumbers.`479`
    - typings.multicodec.multicodecNumbers.`480`
    - typings.multicodec.multicodecNumbers.`496`
    - typings.multicodec.multicodecNumbers.`512`
    - typings.multicodec.multicodecNumbers.`513`
    - typings.multicodec.multicodecNumbers.`769`
    - typings.multicodec.multicodecNumbers.`770`
    - typings.multicodec.multicodecNumbers.`1024`
    - typings.multicodec.multicodecNumbers.`4114`
    - typings.multicodec.multicodecNumbers.`4178`
    - typings.multicodec.multicodecNumbers.`4179`
    - typings.multicodec.multicodecNumbers.`4180`
    - typings.multicodec.multicodecNumbers.`4181`
    - typings.multicodec.multicodecNumbers.`4352`
    - typings.multicodec.multicodecNumbers.`4608`
    - typings.multicodec.multicodecNumbers.`4609`
    - typings.multicodec.multicodecNumbers.`4610`
    - typings.multicodec.multicodecNumbers.`4611`
    - typings.multicodec.multicodecNumbers.`4612`
    - typings.multicodec.multicodecNumbers.`4864`
    - typings.multicodec.multicodecNumbers.`4865`
    - typings.multicodec.multicodecNumbers.`4866`
    - typings.multicodec.multicodecNumbers.`7425`
    - typings.multicodec.multicodecNumbers.`21325`
    - typings.multicodec.multicodecNumbers.`45569`
    - typings.multicodec.multicodecNumbers.`45570`
    - typings.multicodec.multicodecNumbers.`45571`
    - typings.multicodec.multicodecNumbers.`45572`
    - typings.multicodec.multicodecNumbers.`45573`
    - typings.multicodec.multicodecNumbers.`45574`
    - typings.multicodec.multicodecNumbers.`45575`
    - typings.multicodec.multicodecNumbers.`45576`
    - typings.multicodec.multicodecNumbers.`45577`
    - typings.multicodec.multicodecNumbers.`45578`
    - typings.multicodec.multicodecNumbers.`45579`
    - typings.multicodec.multicodecNumbers.`45580`
    - typings.multicodec.multicodecNumbers.`45581`
    - typings.multicodec.multicodecNumbers.`45582`
    - typings.multicodec.multicodecNumbers.`45583`
    - typings.multicodec.multicodecNumbers.`45584`
    - typings.multicodec.multicodecNumbers.`45585`
    - typings.multicodec.multicodecNumbers.`45586`
    - typings.multicodec.multicodecNumbers.`45587`
    - typings.multicodec.multicodecNumbers.`45588`
    - typings.multicodec.multicodecNumbers.`45589`
    - typings.multicodec.multicodecNumbers.`45590`
    - typings.multicodec.multicodecNumbers.`45591`
    - typings.multicodec.multicodecNumbers.`45592`
    - typings.multicodec.multicodecNumbers.`45593`
    - typings.multicodec.multicodecNumbers.`45594`
    - typings.multicodec.multicodecNumbers.`45595`
    - typings.multicodec.multicodecNumbers.`45596`
    - typings.multicodec.multicodecNumbers.`45597`
    - typings.multicodec.multicodecNumbers.`45598`
    - typings.multicodec.multicodecNumbers.`45599`
    - typings.multicodec.multicodecNumbers.`45600`
    - typings.multicodec.multicodecNumbers.`45601`
    - typings.multicodec.multicodecNumbers.`45602`
    - typings.multicodec.multicodecNumbers.`45603`
    - typings.multicodec.multicodecNumbers.`45604`
    - typings.multicodec.multicodecNumbers.`45605`
    - typings.multicodec.multicodecNumbers.`45606`
    - typings.multicodec.multicodecNumbers.`45607`
    - typings.multicodec.multicodecNumbers.`45608`
    - typings.multicodec.multicodecNumbers.`45609`
    - typings.multicodec.multicodecNumbers.`45610`
    - typings.multicodec.multicodecNumbers.`45611`
    - typings.multicodec.multicodecNumbers.`45612`
    - typings.multicodec.multicodecNumbers.`45613`
    - typings.multicodec.multicodecNumbers.`45614`
    - typings.multicodec.multicodecNumbers.`45615`
    - typings.multicodec.multicodecNumbers.`45616`
    - typings.multicodec.multicodecNumbers.`45617`
    - typings.multicodec.multicodecNumbers.`45618`
    - typings.multicodec.multicodecNumbers.`45619`
    - typings.multicodec.multicodecNumbers.`45620`
    - typings.multicodec.multicodecNumbers.`45621`
    - typings.multicodec.multicodecNumbers.`45622`
    - typings.multicodec.multicodecNumbers.`45623`
    - typings.multicodec.multicodecNumbers.`45624`
    - typings.multicodec.multicodecNumbers.`45625`
    - typings.multicodec.multicodecNumbers.`45626`
    - typings.multicodec.multicodecNumbers.`45627`
    - typings.multicodec.multicodecNumbers.`45628`
    - typings.multicodec.multicodecNumbers.`45629`
    - typings.multicodec.multicodecNumbers.`45630`
    - typings.multicodec.multicodecNumbers.`45631`
    - typings.multicodec.multicodecNumbers.`45632`
    - typings.multicodec.multicodecNumbers.`45633`
    - typings.multicodec.multicodecNumbers.`45634`
    - typings.multicodec.multicodecNumbers.`45635`
    - typings.multicodec.multicodecNumbers.`45636`
    - typings.multicodec.multicodecNumbers.`45637`
    - typings.multicodec.multicodecNumbers.`45638`
    - typings.multicodec.multicodecNumbers.`45639`
    - typings.multicodec.multicodecNumbers.`45640`
    - typings.multicodec.multicodecNumbers.`45641`
    - typings.multicodec.multicodecNumbers.`45642`
    - typings.multicodec.multicodecNumbers.`45643`
    - typings.multicodec.multicodecNumbers.`45644`
    - typings.multicodec.multicodecNumbers.`45645`
    - typings.multicodec.multicodecNumbers.`45646`
    - typings.multicodec.multicodecNumbers.`45647`
    - typings.multicodec.multicodecNumbers.`45648`
    - typings.multicodec.multicodecNumbers.`45649`
    - typings.multicodec.multicodecNumbers.`45650`
    - typings.multicodec.multicodecNumbers.`45651`
    - typings.multicodec.multicodecNumbers.`45652`
    - typings.multicodec.multicodecNumbers.`45653`
    - typings.multicodec.multicodecNumbers.`45654`
    - typings.multicodec.multicodecNumbers.`45655`
    - typings.multicodec.multicodecNumbers.`45656`
    - typings.multicodec.multicodecNumbers.`45657`
    - typings.multicodec.multicodecNumbers.`45658`
    - typings.multicodec.multicodecNumbers.`45659`
    - typings.multicodec.multicodecNumbers.`45660`
    - typings.multicodec.multicodecNumbers.`45661`
    - typings.multicodec.multicodecNumbers.`45662`
    - typings.multicodec.multicodecNumbers.`45663`
    - typings.multicodec.multicodecNumbers.`45664`
    - typings.multicodec.multicodecNumbers.`45825`
    - typings.multicodec.multicodecNumbers.`45826`
    - typings.multicodec.multicodecNumbers.`45827`
    - typings.multicodec.multicodecNumbers.`45828`
    - typings.multicodec.multicodecNumbers.`45829`
    - typings.multicodec.multicodecNumbers.`45830`
    - typings.multicodec.multicodecNumbers.`45831`
    - typings.multicodec.multicodecNumbers.`45832`
    - typings.multicodec.multicodecNumbers.`45833`
    - typings.multicodec.multicodecNumbers.`45834`
    - typings.multicodec.multicodecNumbers.`45835`
    - typings.multicodec.multicodecNumbers.`45836`
    - typings.multicodec.multicodecNumbers.`45837`
    - typings.multicodec.multicodecNumbers.`45838`
    - typings.multicodec.multicodecNumbers.`45839`
    - typings.multicodec.multicodecNumbers.`45840`
    - typings.multicodec.multicodecNumbers.`45841`
    - typings.multicodec.multicodecNumbers.`45842`
    - typings.multicodec.multicodecNumbers.`45843`
    - typings.multicodec.multicodecNumbers.`45844`
    - typings.multicodec.multicodecNumbers.`45845`
    - typings.multicodec.multicodecNumbers.`45846`
    - typings.multicodec.multicodecNumbers.`45847`
    - typings.multicodec.multicodecNumbers.`45848`
    - typings.multicodec.multicodecNumbers.`45849`
    - typings.multicodec.multicodecNumbers.`45850`
    - typings.multicodec.multicodecNumbers.`45851`
    - typings.multicodec.multicodecNumbers.`45852`
    - typings.multicodec.multicodecNumbers.`45853`
    - typings.multicodec.multicodecNumbers.`45854`
    - typings.multicodec.multicodecNumbers.`45855`
    - typings.multicodec.multicodecNumbers.`45856`
    - typings.multicodec.multicodecNumbers.`45857`
    - typings.multicodec.multicodecNumbers.`45858`
    - typings.multicodec.multicodecNumbers.`45859`
    - typings.multicodec.multicodecNumbers.`45860`
    - typings.multicodec.multicodecNumbers.`45861`
    - typings.multicodec.multicodecNumbers.`45862`
    - typings.multicodec.multicodecNumbers.`45863`
    - typings.multicodec.multicodecNumbers.`45864`
    - typings.multicodec.multicodecNumbers.`45865`
    - typings.multicodec.multicodecNumbers.`45866`
    - typings.multicodec.multicodecNumbers.`45867`
    - typings.multicodec.multicodecNumbers.`45868`
    - typings.multicodec.multicodecNumbers.`45869`
    - typings.multicodec.multicodecNumbers.`45870`
    - typings.multicodec.multicodecNumbers.`45871`
    - typings.multicodec.multicodecNumbers.`45872`
    - typings.multicodec.multicodecNumbers.`45873`
    - typings.multicodec.multicodecNumbers.`45874`
    - typings.multicodec.multicodecNumbers.`45875`
    - typings.multicodec.multicodecNumbers.`45876`
    - typings.multicodec.multicodecNumbers.`45877`
    - typings.multicodec.multicodecNumbers.`45878`
    - typings.multicodec.multicodecNumbers.`45879`
    - typings.multicodec.multicodecNumbers.`45880`
    - typings.multicodec.multicodecNumbers.`45881`
    - typings.multicodec.multicodecNumbers.`45882`
    - typings.multicodec.multicodecNumbers.`45883`
    - typings.multicodec.multicodecNumbers.`45884`
    - typings.multicodec.multicodecNumbers.`45885`
    - typings.multicodec.multicodecNumbers.`45886`
    - typings.multicodec.multicodecNumbers.`45887`
    - typings.multicodec.multicodecNumbers.`45888`
    - typings.multicodec.multicodecNumbers.`45889`
    - typings.multicodec.multicodecNumbers.`45890`
    - typings.multicodec.multicodecNumbers.`45891`
    - typings.multicodec.multicodecNumbers.`45892`
    - typings.multicodec.multicodecNumbers.`45893`
    - typings.multicodec.multicodecNumbers.`45894`
    - typings.multicodec.multicodecNumbers.`45895`
    - typings.multicodec.multicodecNumbers.`45896`
    - typings.multicodec.multicodecNumbers.`45897`
    - typings.multicodec.multicodecNumbers.`45898`
    - typings.multicodec.multicodecNumbers.`45899`
    - typings.multicodec.multicodecNumbers.`45900`
    - typings.multicodec.multicodecNumbers.`45901`
    - typings.multicodec.multicodecNumbers.`45902`
    - typings.multicodec.multicodecNumbers.`45903`
    - typings.multicodec.multicodecNumbers.`45904`
    - typings.multicodec.multicodecNumbers.`45905`
    - typings.multicodec.multicodecNumbers.`45906`
    - typings.multicodec.multicodecNumbers.`45907`
    - typings.multicodec.multicodecNumbers.`45908`
    - typings.multicodec.multicodecNumbers.`45909`
    - typings.multicodec.multicodecNumbers.`45910`
    - typings.multicodec.multicodecNumbers.`45911`
    - typings.multicodec.multicodecNumbers.`45912`
    - typings.multicodec.multicodecNumbers.`45913`
    - typings.multicodec.multicodecNumbers.`45914`
    - typings.multicodec.multicodecNumbers.`45915`
    - typings.multicodec.multicodecNumbers.`45916`
    - typings.multicodec.multicodecNumbers.`45917`
    - typings.multicodec.multicodecNumbers.`45918`
    - typings.multicodec.multicodecNumbers.`45919`
    - typings.multicodec.multicodecNumbers.`45920`
    - typings.multicodec.multicodecNumbers.`45921`
    - typings.multicodec.multicodecNumbers.`45922`
    - typings.multicodec.multicodecNumbers.`45923`
    - typings.multicodec.multicodecNumbers.`45924`
    - typings.multicodec.multicodecNumbers.`45925`
    - typings.multicodec.multicodecNumbers.`45926`
    - typings.multicodec.multicodecNumbers.`45927`
    - typings.multicodec.multicodecNumbers.`45928`
    - typings.multicodec.multicodecNumbers.`45929`
    - typings.multicodec.multicodecNumbers.`45930`
    - typings.multicodec.multicodecNumbers.`45931`
    - typings.multicodec.multicodecNumbers.`45932`
    - typings.multicodec.multicodecNumbers.`45933`
    - typings.multicodec.multicodecNumbers.`45934`
    - typings.multicodec.multicodecNumbers.`45935`
    - typings.multicodec.multicodecNumbers.`45936`
    - typings.multicodec.multicodecNumbers.`45937`
    - typings.multicodec.multicodecNumbers.`45938`
    - typings.multicodec.multicodecNumbers.`45939`
    - typings.multicodec.multicodecNumbers.`45940`
    - typings.multicodec.multicodecNumbers.`45941`
    - typings.multicodec.multicodecNumbers.`45942`
    - typings.multicodec.multicodecNumbers.`45943`
    - typings.multicodec.multicodecNumbers.`45944`
    - typings.multicodec.multicodecNumbers.`45945`
    - typings.multicodec.multicodecNumbers.`45946`
    - typings.multicodec.multicodecNumbers.`45947`
    - typings.multicodec.multicodecNumbers.`45948`
    - typings.multicodec.multicodecNumbers.`45949`
    - typings.multicodec.multicodecNumbers.`45950`
    - typings.multicodec.multicodecNumbers.`45951`
    - typings.multicodec.multicodecNumbers.`45952`
    - typings.multicodec.multicodecNumbers.`45953`
    - typings.multicodec.multicodecNumbers.`45954`
    - typings.multicodec.multicodecNumbers.`45955`
    - typings.multicodec.multicodecNumbers.`45956`
    - typings.multicodec.multicodecNumbers.`45957`
    - typings.multicodec.multicodecNumbers.`45958`
    - typings.multicodec.multicodecNumbers.`45959`
    - typings.multicodec.multicodecNumbers.`45960`
    - typings.multicodec.multicodecNumbers.`45961`
    - typings.multicodec.multicodecNumbers.`45962`
    - typings.multicodec.multicodecNumbers.`45963`
    - typings.multicodec.multicodecNumbers.`45964`
    - typings.multicodec.multicodecNumbers.`45965`
    - typings.multicodec.multicodecNumbers.`45966`
    - typings.multicodec.multicodecNumbers.`45967`
    - typings.multicodec.multicodecNumbers.`45968`
    - typings.multicodec.multicodecNumbers.`45969`
    - typings.multicodec.multicodecNumbers.`45970`
    - typings.multicodec.multicodecNumbers.`45971`
    - typings.multicodec.multicodecNumbers.`45972`
    - typings.multicodec.multicodecNumbers.`45973`
    - typings.multicodec.multicodecNumbers.`45974`
    - typings.multicodec.multicodecNumbers.`45975`
    - typings.multicodec.multicodecNumbers.`45976`
    - typings.multicodec.multicodecNumbers.`45977`
    - typings.multicodec.multicodecNumbers.`45978`
    - typings.multicodec.multicodecNumbers.`45979`
    - typings.multicodec.multicodecNumbers.`45980`
    - typings.multicodec.multicodecNumbers.`45981`
    - typings.multicodec.multicodecNumbers.`45982`
    - typings.multicodec.multicodecNumbers.`45983`
    - typings.multicodec.multicodecNumbers.`45984`
    - typings.multicodec.multicodecNumbers.`45985`
    - typings.multicodec.multicodecNumbers.`45986`
    - typings.multicodec.multicodecNumbers.`45987`
    - typings.multicodec.multicodecNumbers.`45988`
    - typings.multicodec.multicodecNumbers.`45989`
    - typings.multicodec.multicodecNumbers.`45990`
    - typings.multicodec.multicodecNumbers.`45991`
    - typings.multicodec.multicodecNumbers.`45992`
    - typings.multicodec.multicodecNumbers.`45993`
    - typings.multicodec.multicodecNumbers.`45994`
    - typings.multicodec.multicodecNumbers.`45995`
    - typings.multicodec.multicodecNumbers.`45996`
    - typings.multicodec.multicodecNumbers.`45997`
    - typings.multicodec.multicodecNumbers.`45998`
    - typings.multicodec.multicodecNumbers.`45999`
    - typings.multicodec.multicodecNumbers.`46000`
    - typings.multicodec.multicodecNumbers.`46001`
    - typings.multicodec.multicodecNumbers.`46002`
    - typings.multicodec.multicodecNumbers.`46003`
    - typings.multicodec.multicodecNumbers.`46004`
    - typings.multicodec.multicodecNumbers.`46005`
    - typings.multicodec.multicodecNumbers.`46006`
    - typings.multicodec.multicodecNumbers.`46007`
    - typings.multicodec.multicodecNumbers.`46008`
    - typings.multicodec.multicodecNumbers.`46009`
    - typings.multicodec.multicodecNumbers.`46010`
    - typings.multicodec.multicodecNumbers.`46011`
    - typings.multicodec.multicodecNumbers.`46012`
    - typings.multicodec.multicodecNumbers.`46013`
    - typings.multicodec.multicodecNumbers.`46014`
    - typings.multicodec.multicodecNumbers.`46015`
    - typings.multicodec.multicodecNumbers.`46016`
    - typings.multicodec.multicodecNumbers.`46017`
    - typings.multicodec.multicodecNumbers.`46018`
    - typings.multicodec.multicodecNumbers.`46019`
    - typings.multicodec.multicodecNumbers.`46020`
    - typings.multicodec.multicodecNumbers.`46021`
    - typings.multicodec.multicodecNumbers.`46022`
    - typings.multicodec.multicodecNumbers.`46023`
    - typings.multicodec.multicodecNumbers.`46024`
    - typings.multicodec.multicodecNumbers.`46025`
    - typings.multicodec.multicodecNumbers.`46026`
    - typings.multicodec.multicodecNumbers.`46027`
    - typings.multicodec.multicodecNumbers.`46028`
    - typings.multicodec.multicodecNumbers.`46029`
    - typings.multicodec.multicodecNumbers.`46030`
    - typings.multicodec.multicodecNumbers.`46031`
    - typings.multicodec.multicodecNumbers.`46032`
    - typings.multicodec.multicodecNumbers.`46033`
    - typings.multicodec.multicodecNumbers.`46034`
    - typings.multicodec.multicodecNumbers.`46035`
    - typings.multicodec.multicodecNumbers.`46036`
    - typings.multicodec.multicodecNumbers.`46037`
    - typings.multicodec.multicodecNumbers.`46038`
    - typings.multicodec.multicodecNumbers.`46039`
    - typings.multicodec.multicodecNumbers.`46040`
    - typings.multicodec.multicodecNumbers.`46041`
    - typings.multicodec.multicodecNumbers.`46042`
    - typings.multicodec.multicodecNumbers.`46043`
    - typings.multicodec.multicodecNumbers.`46044`
    - typings.multicodec.multicodecNumbers.`46045`
    - typings.multicodec.multicodecNumbers.`46046`
    - typings.multicodec.multicodecNumbers.`46047`
    - typings.multicodec.multicodecNumbers.`46048`
    - typings.multicodec.multicodecNumbers.`46081`
    - typings.multicodec.multicodecNumbers.`46082`
    - typings.multicodec.multicodecNumbers.`52753`
    - typings.multicodec.multicodecNumbers.`61697`
    - typings.multicodec.multicodecNumbers.`61698`
    - typings.multicodec.multicodecNumbers.`8417572`
    - typings.multicodec.multicodecNumbers.`8483108`
    - typings.multicodec.multicodecNumbers.`9728292`
    - typings.multicodec.multicodecNumbers.`9793828`
    - typings.multicodec.multicodecNumbers.`10645796`
    - typings.multicodec.multicodecNumbers.`10711332`
    - typings.multicodec.multicodecNumbers.`11639056`
    - typings.multicodec.multicodecNumbers.`11704592`
  */
  trait CodecCode extends StObject
  object CodecCode {
    
    inline def `0`: typings.multicodec.multicodecNumbers.`0` = 0.asInstanceOf[typings.multicodec.multicodecNumbers.`0`]
    
    inline def `1`: typings.multicodec.multicodecNumbers.`1` = 1.asInstanceOf[typings.multicodec.multicodecNumbers.`1`]
    
    inline def `1024`: typings.multicodec.multicodecNumbers.`1024` = 1024.asInstanceOf[typings.multicodec.multicodecNumbers.`1024`]
    
    inline def `10645796`: typings.multicodec.multicodecNumbers.`10645796` = 10645796.asInstanceOf[typings.multicodec.multicodecNumbers.`10645796`]
    
    inline def `10711332`: typings.multicodec.multicodecNumbers.`10711332` = 10711332.asInstanceOf[typings.multicodec.multicodecNumbers.`10711332`]
    
    inline def `112`: typings.multicodec.multicodecNumbers.`112` = 112.asInstanceOf[typings.multicodec.multicodecNumbers.`112`]
    
    inline def `113`: typings.multicodec.multicodecNumbers.`113` = 113.asInstanceOf[typings.multicodec.multicodecNumbers.`113`]
    
    inline def `114`: typings.multicodec.multicodecNumbers.`114` = 114.asInstanceOf[typings.multicodec.multicodecNumbers.`114`]
    
    inline def `11639056`: typings.multicodec.multicodecNumbers.`11639056` = 11639056.asInstanceOf[typings.multicodec.multicodecNumbers.`11639056`]
    
    inline def `11704592`: typings.multicodec.multicodecNumbers.`11704592` = 11704592.asInstanceOf[typings.multicodec.multicodecNumbers.`11704592`]
    
    inline def `120`: typings.multicodec.multicodecNumbers.`120` = 120.asInstanceOf[typings.multicodec.multicodecNumbers.`120`]
    
    inline def `123`: typings.multicodec.multicodecNumbers.`123` = 123.asInstanceOf[typings.multicodec.multicodecNumbers.`123`]
    
    inline def `124`: typings.multicodec.multicodecNumbers.`124` = 124.asInstanceOf[typings.multicodec.multicodecNumbers.`124`]
    
    inline def `129`: typings.multicodec.multicodecNumbers.`129` = 129.asInstanceOf[typings.multicodec.multicodecNumbers.`129`]
    
    inline def `130`: typings.multicodec.multicodecNumbers.`130` = 130.asInstanceOf[typings.multicodec.multicodecNumbers.`130`]
    
    inline def `131`: typings.multicodec.multicodecNumbers.`131` = 131.asInstanceOf[typings.multicodec.multicodecNumbers.`131`]
    
    inline def `132`: typings.multicodec.multicodecNumbers.`132` = 132.asInstanceOf[typings.multicodec.multicodecNumbers.`132`]
    
    inline def `133`: typings.multicodec.multicodecNumbers.`133` = 133.asInstanceOf[typings.multicodec.multicodecNumbers.`133`]
    
    inline def `134`: typings.multicodec.multicodecNumbers.`134` = 134.asInstanceOf[typings.multicodec.multicodecNumbers.`134`]
    
    inline def `144`: typings.multicodec.multicodecNumbers.`144` = 144.asInstanceOf[typings.multicodec.multicodecNumbers.`144`]
    
    inline def `145`: typings.multicodec.multicodecNumbers.`145` = 145.asInstanceOf[typings.multicodec.multicodecNumbers.`145`]
    
    inline def `146`: typings.multicodec.multicodecNumbers.`146` = 146.asInstanceOf[typings.multicodec.multicodecNumbers.`146`]
    
    inline def `147`: typings.multicodec.multicodecNumbers.`147` = 147.asInstanceOf[typings.multicodec.multicodecNumbers.`147`]
    
    inline def `148`: typings.multicodec.multicodecNumbers.`148` = 148.asInstanceOf[typings.multicodec.multicodecNumbers.`148`]
    
    inline def `149`: typings.multicodec.multicodecNumbers.`149` = 149.asInstanceOf[typings.multicodec.multicodecNumbers.`149`]
    
    inline def `150`: typings.multicodec.multicodecNumbers.`150` = 150.asInstanceOf[typings.multicodec.multicodecNumbers.`150`]
    
    inline def `151`: typings.multicodec.multicodecNumbers.`151` = 151.asInstanceOf[typings.multicodec.multicodecNumbers.`151`]
    
    inline def `152`: typings.multicodec.multicodecNumbers.`152` = 152.asInstanceOf[typings.multicodec.multicodecNumbers.`152`]
    
    inline def `153`: typings.multicodec.multicodecNumbers.`153` = 153.asInstanceOf[typings.multicodec.multicodecNumbers.`153`]
    
    inline def `154`: typings.multicodec.multicodecNumbers.`154` = 154.asInstanceOf[typings.multicodec.multicodecNumbers.`154`]
    
    inline def `17`: typings.multicodec.multicodecNumbers.`17` = 17.asInstanceOf[typings.multicodec.multicodecNumbers.`17`]
    
    inline def `176`: typings.multicodec.multicodecNumbers.`176` = 176.asInstanceOf[typings.multicodec.multicodecNumbers.`176`]
    
    inline def `177`: typings.multicodec.multicodecNumbers.`177` = 177.asInstanceOf[typings.multicodec.multicodecNumbers.`177`]
    
    inline def `178`: typings.multicodec.multicodecNumbers.`178` = 178.asInstanceOf[typings.multicodec.multicodecNumbers.`178`]
    
    inline def `18`: typings.multicodec.multicodecNumbers.`18` = 18.asInstanceOf[typings.multicodec.multicodecNumbers.`18`]
    
    inline def `19`: typings.multicodec.multicodecNumbers.`19` = 19.asInstanceOf[typings.multicodec.multicodecNumbers.`19`]
    
    inline def `192`: typings.multicodec.multicodecNumbers.`192` = 192.asInstanceOf[typings.multicodec.multicodecNumbers.`192`]
    
    inline def `193`: typings.multicodec.multicodecNumbers.`193` = 193.asInstanceOf[typings.multicodec.multicodecNumbers.`193`]
    
    inline def `2`: typings.multicodec.multicodecNumbers.`2` = 2.asInstanceOf[typings.multicodec.multicodecNumbers.`2`]
    
    inline def `20`: typings.multicodec.multicodecNumbers.`20` = 20.asInstanceOf[typings.multicodec.multicodecNumbers.`20`]
    
    inline def `202`: typings.multicodec.multicodecNumbers.`202` = 202.asInstanceOf[typings.multicodec.multicodecNumbers.`202`]
    
    inline def `206`: typings.multicodec.multicodecNumbers.`206` = 206.asInstanceOf[typings.multicodec.multicodecNumbers.`206`]
    
    inline def `208`: typings.multicodec.multicodecNumbers.`208` = 208.asInstanceOf[typings.multicodec.multicodecNumbers.`208`]
    
    inline def `209`: typings.multicodec.multicodecNumbers.`209` = 209.asInstanceOf[typings.multicodec.multicodecNumbers.`209`]
    
    inline def `21`: typings.multicodec.multicodecNumbers.`21` = 21.asInstanceOf[typings.multicodec.multicodecNumbers.`21`]
    
    inline def `212`: typings.multicodec.multicodecNumbers.`212` = 212.asInstanceOf[typings.multicodec.multicodecNumbers.`212`]
    
    inline def `213`: typings.multicodec.multicodecNumbers.`213` = 213.asInstanceOf[typings.multicodec.multicodecNumbers.`213`]
    
    inline def `21325`: typings.multicodec.multicodecNumbers.`21325` = 21325.asInstanceOf[typings.multicodec.multicodecNumbers.`21325`]
    
    inline def `214`: typings.multicodec.multicodecNumbers.`214` = 214.asInstanceOf[typings.multicodec.multicodecNumbers.`214`]
    
    inline def `22`: typings.multicodec.multicodecNumbers.`22` = 22.asInstanceOf[typings.multicodec.multicodecNumbers.`22`]
    
    inline def `224`: typings.multicodec.multicodecNumbers.`224` = 224.asInstanceOf[typings.multicodec.multicodecNumbers.`224`]
    
    inline def `225`: typings.multicodec.multicodecNumbers.`225` = 225.asInstanceOf[typings.multicodec.multicodecNumbers.`225`]
    
    inline def `226`: typings.multicodec.multicodecNumbers.`226` = 226.asInstanceOf[typings.multicodec.multicodecNumbers.`226`]
    
    inline def `227`: typings.multicodec.multicodecNumbers.`227` = 227.asInstanceOf[typings.multicodec.multicodecNumbers.`227`]
    
    inline def `228`: typings.multicodec.multicodecNumbers.`228` = 228.asInstanceOf[typings.multicodec.multicodecNumbers.`228`]
    
    inline def `229`: typings.multicodec.multicodecNumbers.`229` = 229.asInstanceOf[typings.multicodec.multicodecNumbers.`229`]
    
    inline def `23`: typings.multicodec.multicodecNumbers.`23` = 23.asInstanceOf[typings.multicodec.multicodecNumbers.`23`]
    
    inline def `230`: typings.multicodec.multicodecNumbers.`230` = 230.asInstanceOf[typings.multicodec.multicodecNumbers.`230`]
    
    inline def `231`: typings.multicodec.multicodecNumbers.`231` = 231.asInstanceOf[typings.multicodec.multicodecNumbers.`231`]
    
    inline def `234`: typings.multicodec.multicodecNumbers.`234` = 234.asInstanceOf[typings.multicodec.multicodecNumbers.`234`]
    
    inline def `235`: typings.multicodec.multicodecNumbers.`235` = 235.asInstanceOf[typings.multicodec.multicodecNumbers.`235`]
    
    inline def `236`: typings.multicodec.multicodecNumbers.`236` = 236.asInstanceOf[typings.multicodec.multicodecNumbers.`236`]
    
    inline def `237`: typings.multicodec.multicodecNumbers.`237` = 237.asInstanceOf[typings.multicodec.multicodecNumbers.`237`]
    
    inline def `238`: typings.multicodec.multicodecNumbers.`238` = 238.asInstanceOf[typings.multicodec.multicodecNumbers.`238`]
    
    inline def `24`: typings.multicodec.multicodecNumbers.`24` = 24.asInstanceOf[typings.multicodec.multicodecNumbers.`24`]
    
    inline def `240`: typings.multicodec.multicodecNumbers.`240` = 240.asInstanceOf[typings.multicodec.multicodecNumbers.`240`]
    
    inline def `241`: typings.multicodec.multicodecNumbers.`241` = 241.asInstanceOf[typings.multicodec.multicodecNumbers.`241`]
    
    inline def `25`: typings.multicodec.multicodecNumbers.`25` = 25.asInstanceOf[typings.multicodec.multicodecNumbers.`25`]
    
    inline def `250`: typings.multicodec.multicodecNumbers.`250` = 250.asInstanceOf[typings.multicodec.multicodecNumbers.`250`]
    
    inline def `251`: typings.multicodec.multicodecNumbers.`251` = 251.asInstanceOf[typings.multicodec.multicodecNumbers.`251`]
    
    inline def `26`: typings.multicodec.multicodecNumbers.`26` = 26.asInstanceOf[typings.multicodec.multicodecNumbers.`26`]
    
    inline def `27`: typings.multicodec.multicodecNumbers.`27` = 27.asInstanceOf[typings.multicodec.multicodecNumbers.`27`]
    
    inline def `273`: typings.multicodec.multicodecNumbers.`273` = 273.asInstanceOf[typings.multicodec.multicodecNumbers.`273`]
    
    inline def `275`: typings.multicodec.multicodecNumbers.`275` = 275.asInstanceOf[typings.multicodec.multicodecNumbers.`275`]
    
    inline def `276`: typings.multicodec.multicodecNumbers.`276` = 276.asInstanceOf[typings.multicodec.multicodecNumbers.`276`]
    
    inline def `277`: typings.multicodec.multicodecNumbers.`277` = 277.asInstanceOf[typings.multicodec.multicodecNumbers.`277`]
    
    inline def `28`: typings.multicodec.multicodecNumbers.`28` = 28.asInstanceOf[typings.multicodec.multicodecNumbers.`28`]
    
    inline def `29`: typings.multicodec.multicodecNumbers.`29` = 29.asInstanceOf[typings.multicodec.multicodecNumbers.`29`]
    
    inline def `290`: typings.multicodec.multicodecNumbers.`290` = 290.asInstanceOf[typings.multicodec.multicodecNumbers.`290`]
    
    inline def `297`: typings.multicodec.multicodecNumbers.`297` = 297.asInstanceOf[typings.multicodec.multicodecNumbers.`297`]
    
    inline def `3`: typings.multicodec.multicodecNumbers.`3` = 3.asInstanceOf[typings.multicodec.multicodecNumbers.`3`]
    
    inline def `30`: typings.multicodec.multicodecNumbers.`30` = 30.asInstanceOf[typings.multicodec.multicodecNumbers.`30`]
    
    inline def `301`: typings.multicodec.multicodecNumbers.`301` = 301.asInstanceOf[typings.multicodec.multicodecNumbers.`301`]
    
    inline def `302`: typings.multicodec.multicodecNumbers.`302` = 302.asInstanceOf[typings.multicodec.multicodecNumbers.`302`]
    
    inline def `33`: typings.multicodec.multicodecNumbers.`33` = 33.asInstanceOf[typings.multicodec.multicodecNumbers.`33`]
    
    inline def `34`: typings.multicodec.multicodecNumbers.`34` = 34.asInstanceOf[typings.multicodec.multicodecNumbers.`34`]
    
    inline def `35`: typings.multicodec.multicodecNumbers.`35` = 35.asInstanceOf[typings.multicodec.multicodecNumbers.`35`]
    
    inline def `4`: typings.multicodec.multicodecNumbers.`4` = 4.asInstanceOf[typings.multicodec.multicodecNumbers.`4`]
    
    inline def `400`: typings.multicodec.multicodecNumbers.`400` = 400.asInstanceOf[typings.multicodec.multicodecNumbers.`400`]
    
    inline def `406`: typings.multicodec.multicodecNumbers.`406` = 406.asInstanceOf[typings.multicodec.multicodecNumbers.`406`]
    
    inline def `41`: typings.multicodec.multicodecNumbers.`41` = 41.asInstanceOf[typings.multicodec.multicodecNumbers.`41`]
    
    inline def `4114`: typings.multicodec.multicodecNumbers.`4114` = 4114.asInstanceOf[typings.multicodec.multicodecNumbers.`4114`]
    
    inline def `4178`: typings.multicodec.multicodecNumbers.`4178` = 4178.asInstanceOf[typings.multicodec.multicodecNumbers.`4178`]
    
    inline def `4179`: typings.multicodec.multicodecNumbers.`4179` = 4179.asInstanceOf[typings.multicodec.multicodecNumbers.`4179`]
    
    inline def `4180`: typings.multicodec.multicodecNumbers.`4180` = 4180.asInstanceOf[typings.multicodec.multicodecNumbers.`4180`]
    
    inline def `4181`: typings.multicodec.multicodecNumbers.`4181` = 4181.asInstanceOf[typings.multicodec.multicodecNumbers.`4181`]
    
    inline def `42`: typings.multicodec.multicodecNumbers.`42` = 42.asInstanceOf[typings.multicodec.multicodecNumbers.`42`]
    
    inline def `421`: typings.multicodec.multicodecNumbers.`421` = 421.asInstanceOf[typings.multicodec.multicodecNumbers.`421`]
    
    inline def `4352`: typings.multicodec.multicodecNumbers.`4352` = 4352.asInstanceOf[typings.multicodec.multicodecNumbers.`4352`]
    
    inline def `443`: typings.multicodec.multicodecNumbers.`443` = 443.asInstanceOf[typings.multicodec.multicodecNumbers.`443`]
    
    inline def `444`: typings.multicodec.multicodecNumbers.`444` = 444.asInstanceOf[typings.multicodec.multicodecNumbers.`444`]
    
    inline def `445`: typings.multicodec.multicodecNumbers.`445` = 445.asInstanceOf[typings.multicodec.multicodecNumbers.`445`]
    
    inline def `446`: typings.multicodec.multicodecNumbers.`446` = 446.asInstanceOf[typings.multicodec.multicodecNumbers.`446`]
    
    inline def `447`: typings.multicodec.multicodecNumbers.`447` = 447.asInstanceOf[typings.multicodec.multicodecNumbers.`447`]
    
    inline def `448`: typings.multicodec.multicodecNumbers.`448` = 448.asInstanceOf[typings.multicodec.multicodecNumbers.`448`]
    
    inline def `454`: typings.multicodec.multicodecNumbers.`454` = 454.asInstanceOf[typings.multicodec.multicodecNumbers.`454`]
    
    inline def `45569`: typings.multicodec.multicodecNumbers.`45569` = 45569.asInstanceOf[typings.multicodec.multicodecNumbers.`45569`]
    
    inline def `45570`: typings.multicodec.multicodecNumbers.`45570` = 45570.asInstanceOf[typings.multicodec.multicodecNumbers.`45570`]
    
    inline def `45571`: typings.multicodec.multicodecNumbers.`45571` = 45571.asInstanceOf[typings.multicodec.multicodecNumbers.`45571`]
    
    inline def `45572`: typings.multicodec.multicodecNumbers.`45572` = 45572.asInstanceOf[typings.multicodec.multicodecNumbers.`45572`]
    
    inline def `45573`: typings.multicodec.multicodecNumbers.`45573` = 45573.asInstanceOf[typings.multicodec.multicodecNumbers.`45573`]
    
    inline def `45574`: typings.multicodec.multicodecNumbers.`45574` = 45574.asInstanceOf[typings.multicodec.multicodecNumbers.`45574`]
    
    inline def `45575`: typings.multicodec.multicodecNumbers.`45575` = 45575.asInstanceOf[typings.multicodec.multicodecNumbers.`45575`]
    
    inline def `45576`: typings.multicodec.multicodecNumbers.`45576` = 45576.asInstanceOf[typings.multicodec.multicodecNumbers.`45576`]
    
    inline def `45577`: typings.multicodec.multicodecNumbers.`45577` = 45577.asInstanceOf[typings.multicodec.multicodecNumbers.`45577`]
    
    inline def `45578`: typings.multicodec.multicodecNumbers.`45578` = 45578.asInstanceOf[typings.multicodec.multicodecNumbers.`45578`]
    
    inline def `45579`: typings.multicodec.multicodecNumbers.`45579` = 45579.asInstanceOf[typings.multicodec.multicodecNumbers.`45579`]
    
    inline def `45580`: typings.multicodec.multicodecNumbers.`45580` = 45580.asInstanceOf[typings.multicodec.multicodecNumbers.`45580`]
    
    inline def `45581`: typings.multicodec.multicodecNumbers.`45581` = 45581.asInstanceOf[typings.multicodec.multicodecNumbers.`45581`]
    
    inline def `45582`: typings.multicodec.multicodecNumbers.`45582` = 45582.asInstanceOf[typings.multicodec.multicodecNumbers.`45582`]
    
    inline def `45583`: typings.multicodec.multicodecNumbers.`45583` = 45583.asInstanceOf[typings.multicodec.multicodecNumbers.`45583`]
    
    inline def `45584`: typings.multicodec.multicodecNumbers.`45584` = 45584.asInstanceOf[typings.multicodec.multicodecNumbers.`45584`]
    
    inline def `45585`: typings.multicodec.multicodecNumbers.`45585` = 45585.asInstanceOf[typings.multicodec.multicodecNumbers.`45585`]
    
    inline def `45586`: typings.multicodec.multicodecNumbers.`45586` = 45586.asInstanceOf[typings.multicodec.multicodecNumbers.`45586`]
    
    inline def `45587`: typings.multicodec.multicodecNumbers.`45587` = 45587.asInstanceOf[typings.multicodec.multicodecNumbers.`45587`]
    
    inline def `45588`: typings.multicodec.multicodecNumbers.`45588` = 45588.asInstanceOf[typings.multicodec.multicodecNumbers.`45588`]
    
    inline def `45589`: typings.multicodec.multicodecNumbers.`45589` = 45589.asInstanceOf[typings.multicodec.multicodecNumbers.`45589`]
    
    inline def `45590`: typings.multicodec.multicodecNumbers.`45590` = 45590.asInstanceOf[typings.multicodec.multicodecNumbers.`45590`]
    
    inline def `45591`: typings.multicodec.multicodecNumbers.`45591` = 45591.asInstanceOf[typings.multicodec.multicodecNumbers.`45591`]
    
    inline def `45592`: typings.multicodec.multicodecNumbers.`45592` = 45592.asInstanceOf[typings.multicodec.multicodecNumbers.`45592`]
    
    inline def `45593`: typings.multicodec.multicodecNumbers.`45593` = 45593.asInstanceOf[typings.multicodec.multicodecNumbers.`45593`]
    
    inline def `45594`: typings.multicodec.multicodecNumbers.`45594` = 45594.asInstanceOf[typings.multicodec.multicodecNumbers.`45594`]
    
    inline def `45595`: typings.multicodec.multicodecNumbers.`45595` = 45595.asInstanceOf[typings.multicodec.multicodecNumbers.`45595`]
    
    inline def `45596`: typings.multicodec.multicodecNumbers.`45596` = 45596.asInstanceOf[typings.multicodec.multicodecNumbers.`45596`]
    
    inline def `45597`: typings.multicodec.multicodecNumbers.`45597` = 45597.asInstanceOf[typings.multicodec.multicodecNumbers.`45597`]
    
    inline def `45598`: typings.multicodec.multicodecNumbers.`45598` = 45598.asInstanceOf[typings.multicodec.multicodecNumbers.`45598`]
    
    inline def `45599`: typings.multicodec.multicodecNumbers.`45599` = 45599.asInstanceOf[typings.multicodec.multicodecNumbers.`45599`]
    
    inline def `45600`: typings.multicodec.multicodecNumbers.`45600` = 45600.asInstanceOf[typings.multicodec.multicodecNumbers.`45600`]
    
    inline def `45601`: typings.multicodec.multicodecNumbers.`45601` = 45601.asInstanceOf[typings.multicodec.multicodecNumbers.`45601`]
    
    inline def `45602`: typings.multicodec.multicodecNumbers.`45602` = 45602.asInstanceOf[typings.multicodec.multicodecNumbers.`45602`]
    
    inline def `45603`: typings.multicodec.multicodecNumbers.`45603` = 45603.asInstanceOf[typings.multicodec.multicodecNumbers.`45603`]
    
    inline def `45604`: typings.multicodec.multicodecNumbers.`45604` = 45604.asInstanceOf[typings.multicodec.multicodecNumbers.`45604`]
    
    inline def `45605`: typings.multicodec.multicodecNumbers.`45605` = 45605.asInstanceOf[typings.multicodec.multicodecNumbers.`45605`]
    
    inline def `45606`: typings.multicodec.multicodecNumbers.`45606` = 45606.asInstanceOf[typings.multicodec.multicodecNumbers.`45606`]
    
    inline def `45607`: typings.multicodec.multicodecNumbers.`45607` = 45607.asInstanceOf[typings.multicodec.multicodecNumbers.`45607`]
    
    inline def `45608`: typings.multicodec.multicodecNumbers.`45608` = 45608.asInstanceOf[typings.multicodec.multicodecNumbers.`45608`]
    
    inline def `45609`: typings.multicodec.multicodecNumbers.`45609` = 45609.asInstanceOf[typings.multicodec.multicodecNumbers.`45609`]
    
    inline def `45610`: typings.multicodec.multicodecNumbers.`45610` = 45610.asInstanceOf[typings.multicodec.multicodecNumbers.`45610`]
    
    inline def `45611`: typings.multicodec.multicodecNumbers.`45611` = 45611.asInstanceOf[typings.multicodec.multicodecNumbers.`45611`]
    
    inline def `45612`: typings.multicodec.multicodecNumbers.`45612` = 45612.asInstanceOf[typings.multicodec.multicodecNumbers.`45612`]
    
    inline def `45613`: typings.multicodec.multicodecNumbers.`45613` = 45613.asInstanceOf[typings.multicodec.multicodecNumbers.`45613`]
    
    inline def `45614`: typings.multicodec.multicodecNumbers.`45614` = 45614.asInstanceOf[typings.multicodec.multicodecNumbers.`45614`]
    
    inline def `45615`: typings.multicodec.multicodecNumbers.`45615` = 45615.asInstanceOf[typings.multicodec.multicodecNumbers.`45615`]
    
    inline def `45616`: typings.multicodec.multicodecNumbers.`45616` = 45616.asInstanceOf[typings.multicodec.multicodecNumbers.`45616`]
    
    inline def `45617`: typings.multicodec.multicodecNumbers.`45617` = 45617.asInstanceOf[typings.multicodec.multicodecNumbers.`45617`]
    
    inline def `45618`: typings.multicodec.multicodecNumbers.`45618` = 45618.asInstanceOf[typings.multicodec.multicodecNumbers.`45618`]
    
    inline def `45619`: typings.multicodec.multicodecNumbers.`45619` = 45619.asInstanceOf[typings.multicodec.multicodecNumbers.`45619`]
    
    inline def `45620`: typings.multicodec.multicodecNumbers.`45620` = 45620.asInstanceOf[typings.multicodec.multicodecNumbers.`45620`]
    
    inline def `45621`: typings.multicodec.multicodecNumbers.`45621` = 45621.asInstanceOf[typings.multicodec.multicodecNumbers.`45621`]
    
    inline def `45622`: typings.multicodec.multicodecNumbers.`45622` = 45622.asInstanceOf[typings.multicodec.multicodecNumbers.`45622`]
    
    inline def `45623`: typings.multicodec.multicodecNumbers.`45623` = 45623.asInstanceOf[typings.multicodec.multicodecNumbers.`45623`]
    
    inline def `45624`: typings.multicodec.multicodecNumbers.`45624` = 45624.asInstanceOf[typings.multicodec.multicodecNumbers.`45624`]
    
    inline def `45625`: typings.multicodec.multicodecNumbers.`45625` = 45625.asInstanceOf[typings.multicodec.multicodecNumbers.`45625`]
    
    inline def `45626`: typings.multicodec.multicodecNumbers.`45626` = 45626.asInstanceOf[typings.multicodec.multicodecNumbers.`45626`]
    
    inline def `45627`: typings.multicodec.multicodecNumbers.`45627` = 45627.asInstanceOf[typings.multicodec.multicodecNumbers.`45627`]
    
    inline def `45628`: typings.multicodec.multicodecNumbers.`45628` = 45628.asInstanceOf[typings.multicodec.multicodecNumbers.`45628`]
    
    inline def `45629`: typings.multicodec.multicodecNumbers.`45629` = 45629.asInstanceOf[typings.multicodec.multicodecNumbers.`45629`]
    
    inline def `45630`: typings.multicodec.multicodecNumbers.`45630` = 45630.asInstanceOf[typings.multicodec.multicodecNumbers.`45630`]
    
    inline def `45631`: typings.multicodec.multicodecNumbers.`45631` = 45631.asInstanceOf[typings.multicodec.multicodecNumbers.`45631`]
    
    inline def `45632`: typings.multicodec.multicodecNumbers.`45632` = 45632.asInstanceOf[typings.multicodec.multicodecNumbers.`45632`]
    
    inline def `45633`: typings.multicodec.multicodecNumbers.`45633` = 45633.asInstanceOf[typings.multicodec.multicodecNumbers.`45633`]
    
    inline def `45634`: typings.multicodec.multicodecNumbers.`45634` = 45634.asInstanceOf[typings.multicodec.multicodecNumbers.`45634`]
    
    inline def `45635`: typings.multicodec.multicodecNumbers.`45635` = 45635.asInstanceOf[typings.multicodec.multicodecNumbers.`45635`]
    
    inline def `45636`: typings.multicodec.multicodecNumbers.`45636` = 45636.asInstanceOf[typings.multicodec.multicodecNumbers.`45636`]
    
    inline def `45637`: typings.multicodec.multicodecNumbers.`45637` = 45637.asInstanceOf[typings.multicodec.multicodecNumbers.`45637`]
    
    inline def `45638`: typings.multicodec.multicodecNumbers.`45638` = 45638.asInstanceOf[typings.multicodec.multicodecNumbers.`45638`]
    
    inline def `45639`: typings.multicodec.multicodecNumbers.`45639` = 45639.asInstanceOf[typings.multicodec.multicodecNumbers.`45639`]
    
    inline def `45640`: typings.multicodec.multicodecNumbers.`45640` = 45640.asInstanceOf[typings.multicodec.multicodecNumbers.`45640`]
    
    inline def `45641`: typings.multicodec.multicodecNumbers.`45641` = 45641.asInstanceOf[typings.multicodec.multicodecNumbers.`45641`]
    
    inline def `45642`: typings.multicodec.multicodecNumbers.`45642` = 45642.asInstanceOf[typings.multicodec.multicodecNumbers.`45642`]
    
    inline def `45643`: typings.multicodec.multicodecNumbers.`45643` = 45643.asInstanceOf[typings.multicodec.multicodecNumbers.`45643`]
    
    inline def `45644`: typings.multicodec.multicodecNumbers.`45644` = 45644.asInstanceOf[typings.multicodec.multicodecNumbers.`45644`]
    
    inline def `45645`: typings.multicodec.multicodecNumbers.`45645` = 45645.asInstanceOf[typings.multicodec.multicodecNumbers.`45645`]
    
    inline def `45646`: typings.multicodec.multicodecNumbers.`45646` = 45646.asInstanceOf[typings.multicodec.multicodecNumbers.`45646`]
    
    inline def `45647`: typings.multicodec.multicodecNumbers.`45647` = 45647.asInstanceOf[typings.multicodec.multicodecNumbers.`45647`]
    
    inline def `45648`: typings.multicodec.multicodecNumbers.`45648` = 45648.asInstanceOf[typings.multicodec.multicodecNumbers.`45648`]
    
    inline def `45649`: typings.multicodec.multicodecNumbers.`45649` = 45649.asInstanceOf[typings.multicodec.multicodecNumbers.`45649`]
    
    inline def `45650`: typings.multicodec.multicodecNumbers.`45650` = 45650.asInstanceOf[typings.multicodec.multicodecNumbers.`45650`]
    
    inline def `45651`: typings.multicodec.multicodecNumbers.`45651` = 45651.asInstanceOf[typings.multicodec.multicodecNumbers.`45651`]
    
    inline def `45652`: typings.multicodec.multicodecNumbers.`45652` = 45652.asInstanceOf[typings.multicodec.multicodecNumbers.`45652`]
    
    inline def `45653`: typings.multicodec.multicodecNumbers.`45653` = 45653.asInstanceOf[typings.multicodec.multicodecNumbers.`45653`]
    
    inline def `45654`: typings.multicodec.multicodecNumbers.`45654` = 45654.asInstanceOf[typings.multicodec.multicodecNumbers.`45654`]
    
    inline def `45655`: typings.multicodec.multicodecNumbers.`45655` = 45655.asInstanceOf[typings.multicodec.multicodecNumbers.`45655`]
    
    inline def `45656`: typings.multicodec.multicodecNumbers.`45656` = 45656.asInstanceOf[typings.multicodec.multicodecNumbers.`45656`]
    
    inline def `45657`: typings.multicodec.multicodecNumbers.`45657` = 45657.asInstanceOf[typings.multicodec.multicodecNumbers.`45657`]
    
    inline def `45658`: typings.multicodec.multicodecNumbers.`45658` = 45658.asInstanceOf[typings.multicodec.multicodecNumbers.`45658`]
    
    inline def `45659`: typings.multicodec.multicodecNumbers.`45659` = 45659.asInstanceOf[typings.multicodec.multicodecNumbers.`45659`]
    
    inline def `45660`: typings.multicodec.multicodecNumbers.`45660` = 45660.asInstanceOf[typings.multicodec.multicodecNumbers.`45660`]
    
    inline def `45661`: typings.multicodec.multicodecNumbers.`45661` = 45661.asInstanceOf[typings.multicodec.multicodecNumbers.`45661`]
    
    inline def `45662`: typings.multicodec.multicodecNumbers.`45662` = 45662.asInstanceOf[typings.multicodec.multicodecNumbers.`45662`]
    
    inline def `45663`: typings.multicodec.multicodecNumbers.`45663` = 45663.asInstanceOf[typings.multicodec.multicodecNumbers.`45663`]
    
    inline def `45664`: typings.multicodec.multicodecNumbers.`45664` = 45664.asInstanceOf[typings.multicodec.multicodecNumbers.`45664`]
    
    inline def `45825`: typings.multicodec.multicodecNumbers.`45825` = 45825.asInstanceOf[typings.multicodec.multicodecNumbers.`45825`]
    
    inline def `45826`: typings.multicodec.multicodecNumbers.`45826` = 45826.asInstanceOf[typings.multicodec.multicodecNumbers.`45826`]
    
    inline def `45827`: typings.multicodec.multicodecNumbers.`45827` = 45827.asInstanceOf[typings.multicodec.multicodecNumbers.`45827`]
    
    inline def `45828`: typings.multicodec.multicodecNumbers.`45828` = 45828.asInstanceOf[typings.multicodec.multicodecNumbers.`45828`]
    
    inline def `45829`: typings.multicodec.multicodecNumbers.`45829` = 45829.asInstanceOf[typings.multicodec.multicodecNumbers.`45829`]
    
    inline def `45830`: typings.multicodec.multicodecNumbers.`45830` = 45830.asInstanceOf[typings.multicodec.multicodecNumbers.`45830`]
    
    inline def `45831`: typings.multicodec.multicodecNumbers.`45831` = 45831.asInstanceOf[typings.multicodec.multicodecNumbers.`45831`]
    
    inline def `45832`: typings.multicodec.multicodecNumbers.`45832` = 45832.asInstanceOf[typings.multicodec.multicodecNumbers.`45832`]
    
    inline def `45833`: typings.multicodec.multicodecNumbers.`45833` = 45833.asInstanceOf[typings.multicodec.multicodecNumbers.`45833`]
    
    inline def `45834`: typings.multicodec.multicodecNumbers.`45834` = 45834.asInstanceOf[typings.multicodec.multicodecNumbers.`45834`]
    
    inline def `45835`: typings.multicodec.multicodecNumbers.`45835` = 45835.asInstanceOf[typings.multicodec.multicodecNumbers.`45835`]
    
    inline def `45836`: typings.multicodec.multicodecNumbers.`45836` = 45836.asInstanceOf[typings.multicodec.multicodecNumbers.`45836`]
    
    inline def `45837`: typings.multicodec.multicodecNumbers.`45837` = 45837.asInstanceOf[typings.multicodec.multicodecNumbers.`45837`]
    
    inline def `45838`: typings.multicodec.multicodecNumbers.`45838` = 45838.asInstanceOf[typings.multicodec.multicodecNumbers.`45838`]
    
    inline def `45839`: typings.multicodec.multicodecNumbers.`45839` = 45839.asInstanceOf[typings.multicodec.multicodecNumbers.`45839`]
    
    inline def `45840`: typings.multicodec.multicodecNumbers.`45840` = 45840.asInstanceOf[typings.multicodec.multicodecNumbers.`45840`]
    
    inline def `45841`: typings.multicodec.multicodecNumbers.`45841` = 45841.asInstanceOf[typings.multicodec.multicodecNumbers.`45841`]
    
    inline def `45842`: typings.multicodec.multicodecNumbers.`45842` = 45842.asInstanceOf[typings.multicodec.multicodecNumbers.`45842`]
    
    inline def `45843`: typings.multicodec.multicodecNumbers.`45843` = 45843.asInstanceOf[typings.multicodec.multicodecNumbers.`45843`]
    
    inline def `45844`: typings.multicodec.multicodecNumbers.`45844` = 45844.asInstanceOf[typings.multicodec.multicodecNumbers.`45844`]
    
    inline def `45845`: typings.multicodec.multicodecNumbers.`45845` = 45845.asInstanceOf[typings.multicodec.multicodecNumbers.`45845`]
    
    inline def `45846`: typings.multicodec.multicodecNumbers.`45846` = 45846.asInstanceOf[typings.multicodec.multicodecNumbers.`45846`]
    
    inline def `45847`: typings.multicodec.multicodecNumbers.`45847` = 45847.asInstanceOf[typings.multicodec.multicodecNumbers.`45847`]
    
    inline def `45848`: typings.multicodec.multicodecNumbers.`45848` = 45848.asInstanceOf[typings.multicodec.multicodecNumbers.`45848`]
    
    inline def `45849`: typings.multicodec.multicodecNumbers.`45849` = 45849.asInstanceOf[typings.multicodec.multicodecNumbers.`45849`]
    
    inline def `45850`: typings.multicodec.multicodecNumbers.`45850` = 45850.asInstanceOf[typings.multicodec.multicodecNumbers.`45850`]
    
    inline def `45851`: typings.multicodec.multicodecNumbers.`45851` = 45851.asInstanceOf[typings.multicodec.multicodecNumbers.`45851`]
    
    inline def `45852`: typings.multicodec.multicodecNumbers.`45852` = 45852.asInstanceOf[typings.multicodec.multicodecNumbers.`45852`]
    
    inline def `45853`: typings.multicodec.multicodecNumbers.`45853` = 45853.asInstanceOf[typings.multicodec.multicodecNumbers.`45853`]
    
    inline def `45854`: typings.multicodec.multicodecNumbers.`45854` = 45854.asInstanceOf[typings.multicodec.multicodecNumbers.`45854`]
    
    inline def `45855`: typings.multicodec.multicodecNumbers.`45855` = 45855.asInstanceOf[typings.multicodec.multicodecNumbers.`45855`]
    
    inline def `45856`: typings.multicodec.multicodecNumbers.`45856` = 45856.asInstanceOf[typings.multicodec.multicodecNumbers.`45856`]
    
    inline def `45857`: typings.multicodec.multicodecNumbers.`45857` = 45857.asInstanceOf[typings.multicodec.multicodecNumbers.`45857`]
    
    inline def `45858`: typings.multicodec.multicodecNumbers.`45858` = 45858.asInstanceOf[typings.multicodec.multicodecNumbers.`45858`]
    
    inline def `45859`: typings.multicodec.multicodecNumbers.`45859` = 45859.asInstanceOf[typings.multicodec.multicodecNumbers.`45859`]
    
    inline def `45860`: typings.multicodec.multicodecNumbers.`45860` = 45860.asInstanceOf[typings.multicodec.multicodecNumbers.`45860`]
    
    inline def `45861`: typings.multicodec.multicodecNumbers.`45861` = 45861.asInstanceOf[typings.multicodec.multicodecNumbers.`45861`]
    
    inline def `45862`: typings.multicodec.multicodecNumbers.`45862` = 45862.asInstanceOf[typings.multicodec.multicodecNumbers.`45862`]
    
    inline def `45863`: typings.multicodec.multicodecNumbers.`45863` = 45863.asInstanceOf[typings.multicodec.multicodecNumbers.`45863`]
    
    inline def `45864`: typings.multicodec.multicodecNumbers.`45864` = 45864.asInstanceOf[typings.multicodec.multicodecNumbers.`45864`]
    
    inline def `45865`: typings.multicodec.multicodecNumbers.`45865` = 45865.asInstanceOf[typings.multicodec.multicodecNumbers.`45865`]
    
    inline def `45866`: typings.multicodec.multicodecNumbers.`45866` = 45866.asInstanceOf[typings.multicodec.multicodecNumbers.`45866`]
    
    inline def `45867`: typings.multicodec.multicodecNumbers.`45867` = 45867.asInstanceOf[typings.multicodec.multicodecNumbers.`45867`]
    
    inline def `45868`: typings.multicodec.multicodecNumbers.`45868` = 45868.asInstanceOf[typings.multicodec.multicodecNumbers.`45868`]
    
    inline def `45869`: typings.multicodec.multicodecNumbers.`45869` = 45869.asInstanceOf[typings.multicodec.multicodecNumbers.`45869`]
    
    inline def `45870`: typings.multicodec.multicodecNumbers.`45870` = 45870.asInstanceOf[typings.multicodec.multicodecNumbers.`45870`]
    
    inline def `45871`: typings.multicodec.multicodecNumbers.`45871` = 45871.asInstanceOf[typings.multicodec.multicodecNumbers.`45871`]
    
    inline def `45872`: typings.multicodec.multicodecNumbers.`45872` = 45872.asInstanceOf[typings.multicodec.multicodecNumbers.`45872`]
    
    inline def `45873`: typings.multicodec.multicodecNumbers.`45873` = 45873.asInstanceOf[typings.multicodec.multicodecNumbers.`45873`]
    
    inline def `45874`: typings.multicodec.multicodecNumbers.`45874` = 45874.asInstanceOf[typings.multicodec.multicodecNumbers.`45874`]
    
    inline def `45875`: typings.multicodec.multicodecNumbers.`45875` = 45875.asInstanceOf[typings.multicodec.multicodecNumbers.`45875`]
    
    inline def `45876`: typings.multicodec.multicodecNumbers.`45876` = 45876.asInstanceOf[typings.multicodec.multicodecNumbers.`45876`]
    
    inline def `45877`: typings.multicodec.multicodecNumbers.`45877` = 45877.asInstanceOf[typings.multicodec.multicodecNumbers.`45877`]
    
    inline def `45878`: typings.multicodec.multicodecNumbers.`45878` = 45878.asInstanceOf[typings.multicodec.multicodecNumbers.`45878`]
    
    inline def `45879`: typings.multicodec.multicodecNumbers.`45879` = 45879.asInstanceOf[typings.multicodec.multicodecNumbers.`45879`]
    
    inline def `45880`: typings.multicodec.multicodecNumbers.`45880` = 45880.asInstanceOf[typings.multicodec.multicodecNumbers.`45880`]
    
    inline def `45881`: typings.multicodec.multicodecNumbers.`45881` = 45881.asInstanceOf[typings.multicodec.multicodecNumbers.`45881`]
    
    inline def `45882`: typings.multicodec.multicodecNumbers.`45882` = 45882.asInstanceOf[typings.multicodec.multicodecNumbers.`45882`]
    
    inline def `45883`: typings.multicodec.multicodecNumbers.`45883` = 45883.asInstanceOf[typings.multicodec.multicodecNumbers.`45883`]
    
    inline def `45884`: typings.multicodec.multicodecNumbers.`45884` = 45884.asInstanceOf[typings.multicodec.multicodecNumbers.`45884`]
    
    inline def `45885`: typings.multicodec.multicodecNumbers.`45885` = 45885.asInstanceOf[typings.multicodec.multicodecNumbers.`45885`]
    
    inline def `45886`: typings.multicodec.multicodecNumbers.`45886` = 45886.asInstanceOf[typings.multicodec.multicodecNumbers.`45886`]
    
    inline def `45887`: typings.multicodec.multicodecNumbers.`45887` = 45887.asInstanceOf[typings.multicodec.multicodecNumbers.`45887`]
    
    inline def `45888`: typings.multicodec.multicodecNumbers.`45888` = 45888.asInstanceOf[typings.multicodec.multicodecNumbers.`45888`]
    
    inline def `45889`: typings.multicodec.multicodecNumbers.`45889` = 45889.asInstanceOf[typings.multicodec.multicodecNumbers.`45889`]
    
    inline def `45890`: typings.multicodec.multicodecNumbers.`45890` = 45890.asInstanceOf[typings.multicodec.multicodecNumbers.`45890`]
    
    inline def `45891`: typings.multicodec.multicodecNumbers.`45891` = 45891.asInstanceOf[typings.multicodec.multicodecNumbers.`45891`]
    
    inline def `45892`: typings.multicodec.multicodecNumbers.`45892` = 45892.asInstanceOf[typings.multicodec.multicodecNumbers.`45892`]
    
    inline def `45893`: typings.multicodec.multicodecNumbers.`45893` = 45893.asInstanceOf[typings.multicodec.multicodecNumbers.`45893`]
    
    inline def `45894`: typings.multicodec.multicodecNumbers.`45894` = 45894.asInstanceOf[typings.multicodec.multicodecNumbers.`45894`]
    
    inline def `45895`: typings.multicodec.multicodecNumbers.`45895` = 45895.asInstanceOf[typings.multicodec.multicodecNumbers.`45895`]
    
    inline def `45896`: typings.multicodec.multicodecNumbers.`45896` = 45896.asInstanceOf[typings.multicodec.multicodecNumbers.`45896`]
    
    inline def `45897`: typings.multicodec.multicodecNumbers.`45897` = 45897.asInstanceOf[typings.multicodec.multicodecNumbers.`45897`]
    
    inline def `45898`: typings.multicodec.multicodecNumbers.`45898` = 45898.asInstanceOf[typings.multicodec.multicodecNumbers.`45898`]
    
    inline def `45899`: typings.multicodec.multicodecNumbers.`45899` = 45899.asInstanceOf[typings.multicodec.multicodecNumbers.`45899`]
    
    inline def `45900`: typings.multicodec.multicodecNumbers.`45900` = 45900.asInstanceOf[typings.multicodec.multicodecNumbers.`45900`]
    
    inline def `45901`: typings.multicodec.multicodecNumbers.`45901` = 45901.asInstanceOf[typings.multicodec.multicodecNumbers.`45901`]
    
    inline def `45902`: typings.multicodec.multicodecNumbers.`45902` = 45902.asInstanceOf[typings.multicodec.multicodecNumbers.`45902`]
    
    inline def `45903`: typings.multicodec.multicodecNumbers.`45903` = 45903.asInstanceOf[typings.multicodec.multicodecNumbers.`45903`]
    
    inline def `45904`: typings.multicodec.multicodecNumbers.`45904` = 45904.asInstanceOf[typings.multicodec.multicodecNumbers.`45904`]
    
    inline def `45905`: typings.multicodec.multicodecNumbers.`45905` = 45905.asInstanceOf[typings.multicodec.multicodecNumbers.`45905`]
    
    inline def `45906`: typings.multicodec.multicodecNumbers.`45906` = 45906.asInstanceOf[typings.multicodec.multicodecNumbers.`45906`]
    
    inline def `45907`: typings.multicodec.multicodecNumbers.`45907` = 45907.asInstanceOf[typings.multicodec.multicodecNumbers.`45907`]
    
    inline def `45908`: typings.multicodec.multicodecNumbers.`45908` = 45908.asInstanceOf[typings.multicodec.multicodecNumbers.`45908`]
    
    inline def `45909`: typings.multicodec.multicodecNumbers.`45909` = 45909.asInstanceOf[typings.multicodec.multicodecNumbers.`45909`]
    
    inline def `45910`: typings.multicodec.multicodecNumbers.`45910` = 45910.asInstanceOf[typings.multicodec.multicodecNumbers.`45910`]
    
    inline def `45911`: typings.multicodec.multicodecNumbers.`45911` = 45911.asInstanceOf[typings.multicodec.multicodecNumbers.`45911`]
    
    inline def `45912`: typings.multicodec.multicodecNumbers.`45912` = 45912.asInstanceOf[typings.multicodec.multicodecNumbers.`45912`]
    
    inline def `45913`: typings.multicodec.multicodecNumbers.`45913` = 45913.asInstanceOf[typings.multicodec.multicodecNumbers.`45913`]
    
    inline def `45914`: typings.multicodec.multicodecNumbers.`45914` = 45914.asInstanceOf[typings.multicodec.multicodecNumbers.`45914`]
    
    inline def `45915`: typings.multicodec.multicodecNumbers.`45915` = 45915.asInstanceOf[typings.multicodec.multicodecNumbers.`45915`]
    
    inline def `45916`: typings.multicodec.multicodecNumbers.`45916` = 45916.asInstanceOf[typings.multicodec.multicodecNumbers.`45916`]
    
    inline def `45917`: typings.multicodec.multicodecNumbers.`45917` = 45917.asInstanceOf[typings.multicodec.multicodecNumbers.`45917`]
    
    inline def `45918`: typings.multicodec.multicodecNumbers.`45918` = 45918.asInstanceOf[typings.multicodec.multicodecNumbers.`45918`]
    
    inline def `45919`: typings.multicodec.multicodecNumbers.`45919` = 45919.asInstanceOf[typings.multicodec.multicodecNumbers.`45919`]
    
    inline def `45920`: typings.multicodec.multicodecNumbers.`45920` = 45920.asInstanceOf[typings.multicodec.multicodecNumbers.`45920`]
    
    inline def `45921`: typings.multicodec.multicodecNumbers.`45921` = 45921.asInstanceOf[typings.multicodec.multicodecNumbers.`45921`]
    
    inline def `45922`: typings.multicodec.multicodecNumbers.`45922` = 45922.asInstanceOf[typings.multicodec.multicodecNumbers.`45922`]
    
    inline def `45923`: typings.multicodec.multicodecNumbers.`45923` = 45923.asInstanceOf[typings.multicodec.multicodecNumbers.`45923`]
    
    inline def `45924`: typings.multicodec.multicodecNumbers.`45924` = 45924.asInstanceOf[typings.multicodec.multicodecNumbers.`45924`]
    
    inline def `45925`: typings.multicodec.multicodecNumbers.`45925` = 45925.asInstanceOf[typings.multicodec.multicodecNumbers.`45925`]
    
    inline def `45926`: typings.multicodec.multicodecNumbers.`45926` = 45926.asInstanceOf[typings.multicodec.multicodecNumbers.`45926`]
    
    inline def `45927`: typings.multicodec.multicodecNumbers.`45927` = 45927.asInstanceOf[typings.multicodec.multicodecNumbers.`45927`]
    
    inline def `45928`: typings.multicodec.multicodecNumbers.`45928` = 45928.asInstanceOf[typings.multicodec.multicodecNumbers.`45928`]
    
    inline def `45929`: typings.multicodec.multicodecNumbers.`45929` = 45929.asInstanceOf[typings.multicodec.multicodecNumbers.`45929`]
    
    inline def `45930`: typings.multicodec.multicodecNumbers.`45930` = 45930.asInstanceOf[typings.multicodec.multicodecNumbers.`45930`]
    
    inline def `45931`: typings.multicodec.multicodecNumbers.`45931` = 45931.asInstanceOf[typings.multicodec.multicodecNumbers.`45931`]
    
    inline def `45932`: typings.multicodec.multicodecNumbers.`45932` = 45932.asInstanceOf[typings.multicodec.multicodecNumbers.`45932`]
    
    inline def `45933`: typings.multicodec.multicodecNumbers.`45933` = 45933.asInstanceOf[typings.multicodec.multicodecNumbers.`45933`]
    
    inline def `45934`: typings.multicodec.multicodecNumbers.`45934` = 45934.asInstanceOf[typings.multicodec.multicodecNumbers.`45934`]
    
    inline def `45935`: typings.multicodec.multicodecNumbers.`45935` = 45935.asInstanceOf[typings.multicodec.multicodecNumbers.`45935`]
    
    inline def `45936`: typings.multicodec.multicodecNumbers.`45936` = 45936.asInstanceOf[typings.multicodec.multicodecNumbers.`45936`]
    
    inline def `45937`: typings.multicodec.multicodecNumbers.`45937` = 45937.asInstanceOf[typings.multicodec.multicodecNumbers.`45937`]
    
    inline def `45938`: typings.multicodec.multicodecNumbers.`45938` = 45938.asInstanceOf[typings.multicodec.multicodecNumbers.`45938`]
    
    inline def `45939`: typings.multicodec.multicodecNumbers.`45939` = 45939.asInstanceOf[typings.multicodec.multicodecNumbers.`45939`]
    
    inline def `45940`: typings.multicodec.multicodecNumbers.`45940` = 45940.asInstanceOf[typings.multicodec.multicodecNumbers.`45940`]
    
    inline def `45941`: typings.multicodec.multicodecNumbers.`45941` = 45941.asInstanceOf[typings.multicodec.multicodecNumbers.`45941`]
    
    inline def `45942`: typings.multicodec.multicodecNumbers.`45942` = 45942.asInstanceOf[typings.multicodec.multicodecNumbers.`45942`]
    
    inline def `45943`: typings.multicodec.multicodecNumbers.`45943` = 45943.asInstanceOf[typings.multicodec.multicodecNumbers.`45943`]
    
    inline def `45944`: typings.multicodec.multicodecNumbers.`45944` = 45944.asInstanceOf[typings.multicodec.multicodecNumbers.`45944`]
    
    inline def `45945`: typings.multicodec.multicodecNumbers.`45945` = 45945.asInstanceOf[typings.multicodec.multicodecNumbers.`45945`]
    
    inline def `45946`: typings.multicodec.multicodecNumbers.`45946` = 45946.asInstanceOf[typings.multicodec.multicodecNumbers.`45946`]
    
    inline def `45947`: typings.multicodec.multicodecNumbers.`45947` = 45947.asInstanceOf[typings.multicodec.multicodecNumbers.`45947`]
    
    inline def `45948`: typings.multicodec.multicodecNumbers.`45948` = 45948.asInstanceOf[typings.multicodec.multicodecNumbers.`45948`]
    
    inline def `45949`: typings.multicodec.multicodecNumbers.`45949` = 45949.asInstanceOf[typings.multicodec.multicodecNumbers.`45949`]
    
    inline def `45950`: typings.multicodec.multicodecNumbers.`45950` = 45950.asInstanceOf[typings.multicodec.multicodecNumbers.`45950`]
    
    inline def `45951`: typings.multicodec.multicodecNumbers.`45951` = 45951.asInstanceOf[typings.multicodec.multicodecNumbers.`45951`]
    
    inline def `45952`: typings.multicodec.multicodecNumbers.`45952` = 45952.asInstanceOf[typings.multicodec.multicodecNumbers.`45952`]
    
    inline def `45953`: typings.multicodec.multicodecNumbers.`45953` = 45953.asInstanceOf[typings.multicodec.multicodecNumbers.`45953`]
    
    inline def `45954`: typings.multicodec.multicodecNumbers.`45954` = 45954.asInstanceOf[typings.multicodec.multicodecNumbers.`45954`]
    
    inline def `45955`: typings.multicodec.multicodecNumbers.`45955` = 45955.asInstanceOf[typings.multicodec.multicodecNumbers.`45955`]
    
    inline def `45956`: typings.multicodec.multicodecNumbers.`45956` = 45956.asInstanceOf[typings.multicodec.multicodecNumbers.`45956`]
    
    inline def `45957`: typings.multicodec.multicodecNumbers.`45957` = 45957.asInstanceOf[typings.multicodec.multicodecNumbers.`45957`]
    
    inline def `45958`: typings.multicodec.multicodecNumbers.`45958` = 45958.asInstanceOf[typings.multicodec.multicodecNumbers.`45958`]
    
    inline def `45959`: typings.multicodec.multicodecNumbers.`45959` = 45959.asInstanceOf[typings.multicodec.multicodecNumbers.`45959`]
    
    inline def `45960`: typings.multicodec.multicodecNumbers.`45960` = 45960.asInstanceOf[typings.multicodec.multicodecNumbers.`45960`]
    
    inline def `45961`: typings.multicodec.multicodecNumbers.`45961` = 45961.asInstanceOf[typings.multicodec.multicodecNumbers.`45961`]
    
    inline def `45962`: typings.multicodec.multicodecNumbers.`45962` = 45962.asInstanceOf[typings.multicodec.multicodecNumbers.`45962`]
    
    inline def `45963`: typings.multicodec.multicodecNumbers.`45963` = 45963.asInstanceOf[typings.multicodec.multicodecNumbers.`45963`]
    
    inline def `45964`: typings.multicodec.multicodecNumbers.`45964` = 45964.asInstanceOf[typings.multicodec.multicodecNumbers.`45964`]
    
    inline def `45965`: typings.multicodec.multicodecNumbers.`45965` = 45965.asInstanceOf[typings.multicodec.multicodecNumbers.`45965`]
    
    inline def `45966`: typings.multicodec.multicodecNumbers.`45966` = 45966.asInstanceOf[typings.multicodec.multicodecNumbers.`45966`]
    
    inline def `45967`: typings.multicodec.multicodecNumbers.`45967` = 45967.asInstanceOf[typings.multicodec.multicodecNumbers.`45967`]
    
    inline def `45968`: typings.multicodec.multicodecNumbers.`45968` = 45968.asInstanceOf[typings.multicodec.multicodecNumbers.`45968`]
    
    inline def `45969`: typings.multicodec.multicodecNumbers.`45969` = 45969.asInstanceOf[typings.multicodec.multicodecNumbers.`45969`]
    
    inline def `45970`: typings.multicodec.multicodecNumbers.`45970` = 45970.asInstanceOf[typings.multicodec.multicodecNumbers.`45970`]
    
    inline def `45971`: typings.multicodec.multicodecNumbers.`45971` = 45971.asInstanceOf[typings.multicodec.multicodecNumbers.`45971`]
    
    inline def `45972`: typings.multicodec.multicodecNumbers.`45972` = 45972.asInstanceOf[typings.multicodec.multicodecNumbers.`45972`]
    
    inline def `45973`: typings.multicodec.multicodecNumbers.`45973` = 45973.asInstanceOf[typings.multicodec.multicodecNumbers.`45973`]
    
    inline def `45974`: typings.multicodec.multicodecNumbers.`45974` = 45974.asInstanceOf[typings.multicodec.multicodecNumbers.`45974`]
    
    inline def `45975`: typings.multicodec.multicodecNumbers.`45975` = 45975.asInstanceOf[typings.multicodec.multicodecNumbers.`45975`]
    
    inline def `45976`: typings.multicodec.multicodecNumbers.`45976` = 45976.asInstanceOf[typings.multicodec.multicodecNumbers.`45976`]
    
    inline def `45977`: typings.multicodec.multicodecNumbers.`45977` = 45977.asInstanceOf[typings.multicodec.multicodecNumbers.`45977`]
    
    inline def `45978`: typings.multicodec.multicodecNumbers.`45978` = 45978.asInstanceOf[typings.multicodec.multicodecNumbers.`45978`]
    
    inline def `45979`: typings.multicodec.multicodecNumbers.`45979` = 45979.asInstanceOf[typings.multicodec.multicodecNumbers.`45979`]
    
    inline def `45980`: typings.multicodec.multicodecNumbers.`45980` = 45980.asInstanceOf[typings.multicodec.multicodecNumbers.`45980`]
    
    inline def `45981`: typings.multicodec.multicodecNumbers.`45981` = 45981.asInstanceOf[typings.multicodec.multicodecNumbers.`45981`]
    
    inline def `45982`: typings.multicodec.multicodecNumbers.`45982` = 45982.asInstanceOf[typings.multicodec.multicodecNumbers.`45982`]
    
    inline def `45983`: typings.multicodec.multicodecNumbers.`45983` = 45983.asInstanceOf[typings.multicodec.multicodecNumbers.`45983`]
    
    inline def `45984`: typings.multicodec.multicodecNumbers.`45984` = 45984.asInstanceOf[typings.multicodec.multicodecNumbers.`45984`]
    
    inline def `45985`: typings.multicodec.multicodecNumbers.`45985` = 45985.asInstanceOf[typings.multicodec.multicodecNumbers.`45985`]
    
    inline def `45986`: typings.multicodec.multicodecNumbers.`45986` = 45986.asInstanceOf[typings.multicodec.multicodecNumbers.`45986`]
    
    inline def `45987`: typings.multicodec.multicodecNumbers.`45987` = 45987.asInstanceOf[typings.multicodec.multicodecNumbers.`45987`]
    
    inline def `45988`: typings.multicodec.multicodecNumbers.`45988` = 45988.asInstanceOf[typings.multicodec.multicodecNumbers.`45988`]
    
    inline def `45989`: typings.multicodec.multicodecNumbers.`45989` = 45989.asInstanceOf[typings.multicodec.multicodecNumbers.`45989`]
    
    inline def `45990`: typings.multicodec.multicodecNumbers.`45990` = 45990.asInstanceOf[typings.multicodec.multicodecNumbers.`45990`]
    
    inline def `45991`: typings.multicodec.multicodecNumbers.`45991` = 45991.asInstanceOf[typings.multicodec.multicodecNumbers.`45991`]
    
    inline def `45992`: typings.multicodec.multicodecNumbers.`45992` = 45992.asInstanceOf[typings.multicodec.multicodecNumbers.`45992`]
    
    inline def `45993`: typings.multicodec.multicodecNumbers.`45993` = 45993.asInstanceOf[typings.multicodec.multicodecNumbers.`45993`]
    
    inline def `45994`: typings.multicodec.multicodecNumbers.`45994` = 45994.asInstanceOf[typings.multicodec.multicodecNumbers.`45994`]
    
    inline def `45995`: typings.multicodec.multicodecNumbers.`45995` = 45995.asInstanceOf[typings.multicodec.multicodecNumbers.`45995`]
    
    inline def `45996`: typings.multicodec.multicodecNumbers.`45996` = 45996.asInstanceOf[typings.multicodec.multicodecNumbers.`45996`]
    
    inline def `45997`: typings.multicodec.multicodecNumbers.`45997` = 45997.asInstanceOf[typings.multicodec.multicodecNumbers.`45997`]
    
    inline def `45998`: typings.multicodec.multicodecNumbers.`45998` = 45998.asInstanceOf[typings.multicodec.multicodecNumbers.`45998`]
    
    inline def `45999`: typings.multicodec.multicodecNumbers.`45999` = 45999.asInstanceOf[typings.multicodec.multicodecNumbers.`45999`]
    
    inline def `460`: typings.multicodec.multicodecNumbers.`460` = 460.asInstanceOf[typings.multicodec.multicodecNumbers.`460`]
    
    inline def `46000`: typings.multicodec.multicodecNumbers.`46000` = 46000.asInstanceOf[typings.multicodec.multicodecNumbers.`46000`]
    
    inline def `46001`: typings.multicodec.multicodecNumbers.`46001` = 46001.asInstanceOf[typings.multicodec.multicodecNumbers.`46001`]
    
    inline def `46002`: typings.multicodec.multicodecNumbers.`46002` = 46002.asInstanceOf[typings.multicodec.multicodecNumbers.`46002`]
    
    inline def `46003`: typings.multicodec.multicodecNumbers.`46003` = 46003.asInstanceOf[typings.multicodec.multicodecNumbers.`46003`]
    
    inline def `46004`: typings.multicodec.multicodecNumbers.`46004` = 46004.asInstanceOf[typings.multicodec.multicodecNumbers.`46004`]
    
    inline def `46005`: typings.multicodec.multicodecNumbers.`46005` = 46005.asInstanceOf[typings.multicodec.multicodecNumbers.`46005`]
    
    inline def `46006`: typings.multicodec.multicodecNumbers.`46006` = 46006.asInstanceOf[typings.multicodec.multicodecNumbers.`46006`]
    
    inline def `46007`: typings.multicodec.multicodecNumbers.`46007` = 46007.asInstanceOf[typings.multicodec.multicodecNumbers.`46007`]
    
    inline def `46008`: typings.multicodec.multicodecNumbers.`46008` = 46008.asInstanceOf[typings.multicodec.multicodecNumbers.`46008`]
    
    inline def `46009`: typings.multicodec.multicodecNumbers.`46009` = 46009.asInstanceOf[typings.multicodec.multicodecNumbers.`46009`]
    
    inline def `46010`: typings.multicodec.multicodecNumbers.`46010` = 46010.asInstanceOf[typings.multicodec.multicodecNumbers.`46010`]
    
    inline def `46011`: typings.multicodec.multicodecNumbers.`46011` = 46011.asInstanceOf[typings.multicodec.multicodecNumbers.`46011`]
    
    inline def `46012`: typings.multicodec.multicodecNumbers.`46012` = 46012.asInstanceOf[typings.multicodec.multicodecNumbers.`46012`]
    
    inline def `46013`: typings.multicodec.multicodecNumbers.`46013` = 46013.asInstanceOf[typings.multicodec.multicodecNumbers.`46013`]
    
    inline def `46014`: typings.multicodec.multicodecNumbers.`46014` = 46014.asInstanceOf[typings.multicodec.multicodecNumbers.`46014`]
    
    inline def `46015`: typings.multicodec.multicodecNumbers.`46015` = 46015.asInstanceOf[typings.multicodec.multicodecNumbers.`46015`]
    
    inline def `46016`: typings.multicodec.multicodecNumbers.`46016` = 46016.asInstanceOf[typings.multicodec.multicodecNumbers.`46016`]
    
    inline def `46017`: typings.multicodec.multicodecNumbers.`46017` = 46017.asInstanceOf[typings.multicodec.multicodecNumbers.`46017`]
    
    inline def `46018`: typings.multicodec.multicodecNumbers.`46018` = 46018.asInstanceOf[typings.multicodec.multicodecNumbers.`46018`]
    
    inline def `46019`: typings.multicodec.multicodecNumbers.`46019` = 46019.asInstanceOf[typings.multicodec.multicodecNumbers.`46019`]
    
    inline def `46020`: typings.multicodec.multicodecNumbers.`46020` = 46020.asInstanceOf[typings.multicodec.multicodecNumbers.`46020`]
    
    inline def `46021`: typings.multicodec.multicodecNumbers.`46021` = 46021.asInstanceOf[typings.multicodec.multicodecNumbers.`46021`]
    
    inline def `46022`: typings.multicodec.multicodecNumbers.`46022` = 46022.asInstanceOf[typings.multicodec.multicodecNumbers.`46022`]
    
    inline def `46023`: typings.multicodec.multicodecNumbers.`46023` = 46023.asInstanceOf[typings.multicodec.multicodecNumbers.`46023`]
    
    inline def `46024`: typings.multicodec.multicodecNumbers.`46024` = 46024.asInstanceOf[typings.multicodec.multicodecNumbers.`46024`]
    
    inline def `46025`: typings.multicodec.multicodecNumbers.`46025` = 46025.asInstanceOf[typings.multicodec.multicodecNumbers.`46025`]
    
    inline def `46026`: typings.multicodec.multicodecNumbers.`46026` = 46026.asInstanceOf[typings.multicodec.multicodecNumbers.`46026`]
    
    inline def `46027`: typings.multicodec.multicodecNumbers.`46027` = 46027.asInstanceOf[typings.multicodec.multicodecNumbers.`46027`]
    
    inline def `46028`: typings.multicodec.multicodecNumbers.`46028` = 46028.asInstanceOf[typings.multicodec.multicodecNumbers.`46028`]
    
    inline def `46029`: typings.multicodec.multicodecNumbers.`46029` = 46029.asInstanceOf[typings.multicodec.multicodecNumbers.`46029`]
    
    inline def `46030`: typings.multicodec.multicodecNumbers.`46030` = 46030.asInstanceOf[typings.multicodec.multicodecNumbers.`46030`]
    
    inline def `46031`: typings.multicodec.multicodecNumbers.`46031` = 46031.asInstanceOf[typings.multicodec.multicodecNumbers.`46031`]
    
    inline def `46032`: typings.multicodec.multicodecNumbers.`46032` = 46032.asInstanceOf[typings.multicodec.multicodecNumbers.`46032`]
    
    inline def `46033`: typings.multicodec.multicodecNumbers.`46033` = 46033.asInstanceOf[typings.multicodec.multicodecNumbers.`46033`]
    
    inline def `46034`: typings.multicodec.multicodecNumbers.`46034` = 46034.asInstanceOf[typings.multicodec.multicodecNumbers.`46034`]
    
    inline def `46035`: typings.multicodec.multicodecNumbers.`46035` = 46035.asInstanceOf[typings.multicodec.multicodecNumbers.`46035`]
    
    inline def `46036`: typings.multicodec.multicodecNumbers.`46036` = 46036.asInstanceOf[typings.multicodec.multicodecNumbers.`46036`]
    
    inline def `46037`: typings.multicodec.multicodecNumbers.`46037` = 46037.asInstanceOf[typings.multicodec.multicodecNumbers.`46037`]
    
    inline def `46038`: typings.multicodec.multicodecNumbers.`46038` = 46038.asInstanceOf[typings.multicodec.multicodecNumbers.`46038`]
    
    inline def `46039`: typings.multicodec.multicodecNumbers.`46039` = 46039.asInstanceOf[typings.multicodec.multicodecNumbers.`46039`]
    
    inline def `46040`: typings.multicodec.multicodecNumbers.`46040` = 46040.asInstanceOf[typings.multicodec.multicodecNumbers.`46040`]
    
    inline def `46041`: typings.multicodec.multicodecNumbers.`46041` = 46041.asInstanceOf[typings.multicodec.multicodecNumbers.`46041`]
    
    inline def `46042`: typings.multicodec.multicodecNumbers.`46042` = 46042.asInstanceOf[typings.multicodec.multicodecNumbers.`46042`]
    
    inline def `46043`: typings.multicodec.multicodecNumbers.`46043` = 46043.asInstanceOf[typings.multicodec.multicodecNumbers.`46043`]
    
    inline def `46044`: typings.multicodec.multicodecNumbers.`46044` = 46044.asInstanceOf[typings.multicodec.multicodecNumbers.`46044`]
    
    inline def `46045`: typings.multicodec.multicodecNumbers.`46045` = 46045.asInstanceOf[typings.multicodec.multicodecNumbers.`46045`]
    
    inline def `46046`: typings.multicodec.multicodecNumbers.`46046` = 46046.asInstanceOf[typings.multicodec.multicodecNumbers.`46046`]
    
    inline def `46047`: typings.multicodec.multicodecNumbers.`46047` = 46047.asInstanceOf[typings.multicodec.multicodecNumbers.`46047`]
    
    inline def `46048`: typings.multicodec.multicodecNumbers.`46048` = 46048.asInstanceOf[typings.multicodec.multicodecNumbers.`46048`]
    
    inline def `4608`: typings.multicodec.multicodecNumbers.`4608` = 4608.asInstanceOf[typings.multicodec.multicodecNumbers.`4608`]
    
    inline def `46081`: typings.multicodec.multicodecNumbers.`46081` = 46081.asInstanceOf[typings.multicodec.multicodecNumbers.`46081`]
    
    inline def `46082`: typings.multicodec.multicodecNumbers.`46082` = 46082.asInstanceOf[typings.multicodec.multicodecNumbers.`46082`]
    
    inline def `4609`: typings.multicodec.multicodecNumbers.`4609` = 4609.asInstanceOf[typings.multicodec.multicodecNumbers.`4609`]
    
    inline def `4610`: typings.multicodec.multicodecNumbers.`4610` = 4610.asInstanceOf[typings.multicodec.multicodecNumbers.`4610`]
    
    inline def `4611`: typings.multicodec.multicodecNumbers.`4611` = 4611.asInstanceOf[typings.multicodec.multicodecNumbers.`4611`]
    
    inline def `4612`: typings.multicodec.multicodecNumbers.`4612` = 4612.asInstanceOf[typings.multicodec.multicodecNumbers.`4612`]
    
    inline def `47`: typings.multicodec.multicodecNumbers.`47` = 47.asInstanceOf[typings.multicodec.multicodecNumbers.`47`]
    
    inline def `477`: typings.multicodec.multicodecNumbers.`477` = 477.asInstanceOf[typings.multicodec.multicodecNumbers.`477`]
    
    inline def `478`: typings.multicodec.multicodecNumbers.`478` = 478.asInstanceOf[typings.multicodec.multicodecNumbers.`478`]
    
    inline def `479`: typings.multicodec.multicodecNumbers.`479` = 479.asInstanceOf[typings.multicodec.multicodecNumbers.`479`]
    
    inline def `48`: typings.multicodec.multicodecNumbers.`48` = 48.asInstanceOf[typings.multicodec.multicodecNumbers.`48`]
    
    inline def `480`: typings.multicodec.multicodecNumbers.`480` = 480.asInstanceOf[typings.multicodec.multicodecNumbers.`480`]
    
    inline def `4864`: typings.multicodec.multicodecNumbers.`4864` = 4864.asInstanceOf[typings.multicodec.multicodecNumbers.`4864`]
    
    inline def `4865`: typings.multicodec.multicodecNumbers.`4865` = 4865.asInstanceOf[typings.multicodec.multicodecNumbers.`4865`]
    
    inline def `4866`: typings.multicodec.multicodecNumbers.`4866` = 4866.asInstanceOf[typings.multicodec.multicodecNumbers.`4866`]
    
    inline def `49`: typings.multicodec.multicodecNumbers.`49` = 49.asInstanceOf[typings.multicodec.multicodecNumbers.`49`]
    
    inline def `496`: typings.multicodec.multicodecNumbers.`496` = 496.asInstanceOf[typings.multicodec.multicodecNumbers.`496`]
    
    inline def `50`: typings.multicodec.multicodecNumbers.`50` = 50.asInstanceOf[typings.multicodec.multicodecNumbers.`50`]
    
    inline def `51`: typings.multicodec.multicodecNumbers.`51` = 51.asInstanceOf[typings.multicodec.multicodecNumbers.`51`]
    
    inline def `512`: typings.multicodec.multicodecNumbers.`512` = 512.asInstanceOf[typings.multicodec.multicodecNumbers.`512`]
    
    inline def `513`: typings.multicodec.multicodecNumbers.`513` = 513.asInstanceOf[typings.multicodec.multicodecNumbers.`513`]
    
    inline def `52753`: typings.multicodec.multicodecNumbers.`52753` = 52753.asInstanceOf[typings.multicodec.multicodecNumbers.`52753`]
    
    inline def `53`: typings.multicodec.multicodecNumbers.`53` = 53.asInstanceOf[typings.multicodec.multicodecNumbers.`53`]
    
    inline def `54`: typings.multicodec.multicodecNumbers.`54` = 54.asInstanceOf[typings.multicodec.multicodecNumbers.`54`]
    
    inline def `55`: typings.multicodec.multicodecNumbers.`55` = 55.asInstanceOf[typings.multicodec.multicodecNumbers.`55`]
    
    inline def `56`: typings.multicodec.multicodecNumbers.`56` = 56.asInstanceOf[typings.multicodec.multicodecNumbers.`56`]
    
    inline def `6`: typings.multicodec.multicodecNumbers.`6` = 6.asInstanceOf[typings.multicodec.multicodecNumbers.`6`]
    
    inline def `61697`: typings.multicodec.multicodecNumbers.`61697` = 61697.asInstanceOf[typings.multicodec.multicodecNumbers.`61697`]
    
    inline def `61698`: typings.multicodec.multicodecNumbers.`61698` = 61698.asInstanceOf[typings.multicodec.multicodecNumbers.`61698`]
    
    inline def `7425`: typings.multicodec.multicodecNumbers.`7425` = 7425.asInstanceOf[typings.multicodec.multicodecNumbers.`7425`]
    
    inline def `769`: typings.multicodec.multicodecNumbers.`769` = 769.asInstanceOf[typings.multicodec.multicodecNumbers.`769`]
    
    inline def `770`: typings.multicodec.multicodecNumbers.`770` = 770.asInstanceOf[typings.multicodec.multicodecNumbers.`770`]
    
    inline def `80`: typings.multicodec.multicodecNumbers.`80` = 80.asInstanceOf[typings.multicodec.multicodecNumbers.`80`]
    
    inline def `81`: typings.multicodec.multicodecNumbers.`81` = 81.asInstanceOf[typings.multicodec.multicodecNumbers.`81`]
    
    inline def `8417572`: typings.multicodec.multicodecNumbers.`8417572` = 8417572.asInstanceOf[typings.multicodec.multicodecNumbers.`8417572`]
    
    inline def `8483108`: typings.multicodec.multicodecNumbers.`8483108` = 8483108.asInstanceOf[typings.multicodec.multicodecNumbers.`8483108`]
    
    inline def `85`: typings.multicodec.multicodecNumbers.`85` = 85.asInstanceOf[typings.multicodec.multicodecNumbers.`85`]
    
    inline def `86`: typings.multicodec.multicodecNumbers.`86` = 86.asInstanceOf[typings.multicodec.multicodecNumbers.`86`]
    
    inline def `96`: typings.multicodec.multicodecNumbers.`96` = 96.asInstanceOf[typings.multicodec.multicodecNumbers.`96`]
    
    inline def `9728292`: typings.multicodec.multicodecNumbers.`9728292` = 9728292.asInstanceOf[typings.multicodec.multicodecNumbers.`9728292`]
    
    inline def `9793828`: typings.multicodec.multicodecNumbers.`9793828` = 9793828.asInstanceOf[typings.multicodec.multicodecNumbers.`9793828`]
    
    inline def `99`: typings.multicodec.multicodecNumbers.`99` = 99.asInstanceOf[typings.multicodec.multicodecNumbers.`99`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.multicodec.multicodecStrings.identity_
    - typings.multicodec.multicodecStrings.cidv1_
    - typings.multicodec.multicodecStrings.cidv2_
    - typings.multicodec.multicodecStrings.cidv3_
    - typings.multicodec.multicodecStrings.ip4_
    - typings.multicodec.multicodecStrings.tcp_
    - typings.multicodec.multicodecStrings.sha1_
    - typings.multicodec.multicodecStrings.`sha2-256`
    - typings.multicodec.multicodecStrings.`sha2-512`
    - typings.multicodec.multicodecStrings.`sha3-512`
    - typings.multicodec.multicodecStrings.`sha3-384`
    - typings.multicodec.multicodecStrings.`sha3-256`
    - typings.multicodec.multicodecStrings.`sha3-224`
    - typings.multicodec.multicodecStrings.`shake-128`
    - typings.multicodec.multicodecStrings.`shake-256`
    - typings.multicodec.multicodecStrings.`keccak-224`
    - typings.multicodec.multicodecStrings.`keccak-256`
    - typings.multicodec.multicodecStrings.`keccak-384`
    - typings.multicodec.multicodecStrings.`keccak-512`
    - typings.multicodec.multicodecStrings.blake3_
    - typings.multicodec.multicodecStrings.dccp_
    - typings.multicodec.multicodecStrings.`murmur3-128`
    - typings.multicodec.multicodecStrings.`murmur3-32`
    - typings.multicodec.multicodecStrings.ip6_
    - typings.multicodec.multicodecStrings.ip6zone_
    - typings.multicodec.multicodecStrings.path_
    - typings.multicodec.multicodecStrings.multicodec_
    - typings.multicodec.multicodecStrings.multihash_
    - typings.multicodec.multicodecStrings.multiaddr_
    - typings.multicodec.multicodecStrings.multibase_
    - typings.multicodec.multicodecStrings.dns_
    - typings.multicodec.multicodecStrings.dns4_
    - typings.multicodec.multicodecStrings.dns6_
    - typings.multicodec.multicodecStrings.dnsaddr_
    - typings.multicodec.multicodecStrings.protobuf_
    - typings.multicodec.multicodecStrings.cbor_
    - typings.multicodec.multicodecStrings.raw_
    - typings.multicodec.multicodecStrings.`dbl-sha2-256`
    - typings.multicodec.multicodecStrings.rlp_
    - typings.multicodec.multicodecStrings.bencode_
    - typings.multicodec.multicodecStrings.`dag-pb`
    - typings.multicodec.multicodecStrings.`dag-cbor`
    - typings.multicodec.multicodecStrings.`libp2p-key`
    - typings.multicodec.multicodecStrings.`git-raw`
    - typings.multicodec.multicodecStrings.`torrent-info`
    - typings.multicodec.multicodecStrings.`torrent-file`
    - typings.multicodec.multicodecStrings.`leofcoin-block`
    - typings.multicodec.multicodecStrings.`leofcoin-tx`
    - typings.multicodec.multicodecStrings.`leofcoin-pr`
    - typings.multicodec.multicodecStrings.sctp_
    - typings.multicodec.multicodecStrings.`dag-jose`
    - typings.multicodec.multicodecStrings.`dag-cose`
    - typings.multicodec.multicodecStrings.`eth-block`
    - typings.multicodec.multicodecStrings.`eth-block-list`
    - typings.multicodec.multicodecStrings.`eth-tx-trie`
    - typings.multicodec.multicodecStrings.`eth-tx`
    - typings.multicodec.multicodecStrings.`eth-tx-receipt-trie`
    - typings.multicodec.multicodecStrings.`eth-tx-receipt`
    - typings.multicodec.multicodecStrings.`eth-state-trie`
    - typings.multicodec.multicodecStrings.`eth-account-snapshot`
    - typings.multicodec.multicodecStrings.`eth-storage-trie`
    - typings.multicodec.multicodecStrings.`eth-receipt-log-trie`
    - typings.multicodec.multicodecStrings.`eth-reciept-log`
    - typings.multicodec.multicodecStrings.`bitcoin-block`
    - typings.multicodec.multicodecStrings.`bitcoin-tx`
    - typings.multicodec.multicodecStrings.`bitcoin-witness-commitment`
    - typings.multicodec.multicodecStrings.`zcash-block`
    - typings.multicodec.multicodecStrings.`zcash-tx`
    - typings.multicodec.multicodecStrings.`caip-50`
    - typings.multicodec.multicodecStrings.streamid_
    - typings.multicodec.multicodecStrings.`stellar-block`
    - typings.multicodec.multicodecStrings.`stellar-tx`
    - typings.multicodec.multicodecStrings.md4_
    - typings.multicodec.multicodecStrings.md5_
    - typings.multicodec.multicodecStrings.bmt_
    - typings.multicodec.multicodecStrings.`decred-block`
    - typings.multicodec.multicodecStrings.`decred-tx`
    - typings.multicodec.multicodecStrings.`ipld-ns`
    - typings.multicodec.multicodecStrings.`ipfs-ns`
    - typings.multicodec.multicodecStrings.`swarm-ns`
    - typings.multicodec.multicodecStrings.`ipns-ns`
    - typings.multicodec.multicodecStrings.zeronet_
    - typings.multicodec.multicodecStrings.`secp256k1-pub`
    - typings.multicodec.multicodecStrings.`bls12_381-g1-pub`
    - typings.multicodec.multicodecStrings.`bls12_381-g2-pub`
    - typings.multicodec.multicodecStrings.`x25519-pub`
    - typings.multicodec.multicodecStrings.`ed25519-pub`
    - typings.multicodec.multicodecStrings.`bls12_381-g1g2-pub`
    - typings.multicodec.multicodecStrings.`dash-block`
    - typings.multicodec.multicodecStrings.`dash-tx`
    - typings.multicodec.multicodecStrings.`swarm-manifest`
    - typings.multicodec.multicodecStrings.`swarm-feed`
    - typings.multicodec.multicodecStrings.udp_
    - typings.multicodec.multicodecStrings.`p2p-webrtc-star`
    - typings.multicodec.multicodecStrings.`p2p-webrtc-direct`
    - typings.multicodec.multicodecStrings.`p2p-stardust`
    - typings.multicodec.multicodecStrings.`p2p-circuit`
    - typings.multicodec.multicodecStrings.`dag-json`
    - typings.multicodec.multicodecStrings.udt_
    - typings.multicodec.multicodecStrings.utp_
    - typings.multicodec.multicodecStrings.unix_
    - typings.multicodec.multicodecStrings.thread_
    - typings.multicodec.multicodecStrings.p2p_
    - typings.multicodec.multicodecStrings.ipfs_
    - typings.multicodec.multicodecStrings.https_
    - typings.multicodec.multicodecStrings.onion_
    - typings.multicodec.multicodecStrings.onion3_
    - typings.multicodec.multicodecStrings.garlic64_
    - typings.multicodec.multicodecStrings.garlic32_
    - typings.multicodec.multicodecStrings.tls_
    - typings.multicodec.multicodecStrings.noise_
    - typings.multicodec.multicodecStrings.quic_
    - typings.multicodec.multicodecStrings.ws_
    - typings.multicodec.multicodecStrings.wss_
    - typings.multicodec.multicodecStrings.`p2p-websocket-star`
    - typings.multicodec.multicodecStrings.http_
    - typings.multicodec.multicodecStrings.`swhid-1-snp`
    - typings.multicodec.multicodecStrings.json_
    - typings.multicodec.multicodecStrings.messagepack_
    - typings.multicodec.multicodecStrings.`libp2p-peer-record`
    - typings.multicodec.multicodecStrings.`libp2p-relay-rsvp`
    - typings.multicodec.multicodecStrings.`car-index-sorted`
    - typings.multicodec.multicodecStrings.`sha2-256-trunc254-padded`
    - typings.multicodec.multicodecStrings.`ripemd-128`
    - typings.multicodec.multicodecStrings.`ripemd-160`
    - typings.multicodec.multicodecStrings.`ripemd-256`
    - typings.multicodec.multicodecStrings.`ripemd-320`
    - typings.multicodec.multicodecStrings.x11_
    - typings.multicodec.multicodecStrings.`p256-pub`
    - typings.multicodec.multicodecStrings.`p384-pub`
    - typings.multicodec.multicodecStrings.`p521-pub`
    - typings.multicodec.multicodecStrings.`ed448-pub`
    - typings.multicodec.multicodecStrings.`x448-pub`
    - typings.multicodec.multicodecStrings.`ed25519-priv`
    - typings.multicodec.multicodecStrings.`secp256k1-priv`
    - typings.multicodec.multicodecStrings.`x25519-priv`
    - typings.multicodec.multicodecStrings.kangarootwelve_
    - typings.multicodec.multicodecStrings.`sm3-256`
    - typings.multicodec.multicodecStrings.`blake2b-8`
    - typings.multicodec.multicodecStrings.`blake2b-16`
    - typings.multicodec.multicodecStrings.`blake2b-24`
    - typings.multicodec.multicodecStrings.`blake2b-32`
    - typings.multicodec.multicodecStrings.`blake2b-40`
    - typings.multicodec.multicodecStrings.`blake2b-48`
    - typings.multicodec.multicodecStrings.`blake2b-56`
    - typings.multicodec.multicodecStrings.`blake2b-64`
    - typings.multicodec.multicodecStrings.`blake2b-72`
    - typings.multicodec.multicodecStrings.`blake2b-80`
    - typings.multicodec.multicodecStrings.`blake2b-88`
    - typings.multicodec.multicodecStrings.`blake2b-96`
    - typings.multicodec.multicodecStrings.`blake2b-104`
    - typings.multicodec.multicodecStrings.`blake2b-112`
    - typings.multicodec.multicodecStrings.`blake2b-120`
    - typings.multicodec.multicodecStrings.`blake2b-128`
    - typings.multicodec.multicodecStrings.`blake2b-136`
    - typings.multicodec.multicodecStrings.`blake2b-144`
    - typings.multicodec.multicodecStrings.`blake2b-152`
    - typings.multicodec.multicodecStrings.`blake2b-160`
    - typings.multicodec.multicodecStrings.`blake2b-168`
    - typings.multicodec.multicodecStrings.`blake2b-176`
    - typings.multicodec.multicodecStrings.`blake2b-184`
    - typings.multicodec.multicodecStrings.`blake2b-192`
    - typings.multicodec.multicodecStrings.`blake2b-200`
    - typings.multicodec.multicodecStrings.`blake2b-208`
    - typings.multicodec.multicodecStrings.`blake2b-216`
    - typings.multicodec.multicodecStrings.`blake2b-224`
    - typings.multicodec.multicodecStrings.`blake2b-232`
    - typings.multicodec.multicodecStrings.`blake2b-240`
    - typings.multicodec.multicodecStrings.`blake2b-248`
    - typings.multicodec.multicodecStrings.`blake2b-256`
    - typings.multicodec.multicodecStrings.`blake2b-264`
    - typings.multicodec.multicodecStrings.`blake2b-272`
    - typings.multicodec.multicodecStrings.`blake2b-280`
    - typings.multicodec.multicodecStrings.`blake2b-288`
    - typings.multicodec.multicodecStrings.`blake2b-296`
    - typings.multicodec.multicodecStrings.`blake2b-304`
    - typings.multicodec.multicodecStrings.`blake2b-312`
    - typings.multicodec.multicodecStrings.`blake2b-320`
    - typings.multicodec.multicodecStrings.`blake2b-328`
    - typings.multicodec.multicodecStrings.`blake2b-336`
    - typings.multicodec.multicodecStrings.`blake2b-344`
    - typings.multicodec.multicodecStrings.`blake2b-352`
    - typings.multicodec.multicodecStrings.`blake2b-360`
    - typings.multicodec.multicodecStrings.`blake2b-368`
    - typings.multicodec.multicodecStrings.`blake2b-376`
    - typings.multicodec.multicodecStrings.`blake2b-384`
    - typings.multicodec.multicodecStrings.`blake2b-392`
    - typings.multicodec.multicodecStrings.`blake2b-400`
    - typings.multicodec.multicodecStrings.`blake2b-408`
    - typings.multicodec.multicodecStrings.`blake2b-416`
    - typings.multicodec.multicodecStrings.`blake2b-424`
    - typings.multicodec.multicodecStrings.`blake2b-432`
    - typings.multicodec.multicodecStrings.`blake2b-440`
    - typings.multicodec.multicodecStrings.`blake2b-448`
    - typings.multicodec.multicodecStrings.`blake2b-456`
    - typings.multicodec.multicodecStrings.`blake2b-464`
    - typings.multicodec.multicodecStrings.`blake2b-472`
    - typings.multicodec.multicodecStrings.`blake2b-480`
    - typings.multicodec.multicodecStrings.`blake2b-488`
    - typings.multicodec.multicodecStrings.`blake2b-496`
    - typings.multicodec.multicodecStrings.`blake2b-504`
    - typings.multicodec.multicodecStrings.`blake2b-512`
    - typings.multicodec.multicodecStrings.`blake2s-8`
    - typings.multicodec.multicodecStrings.`blake2s-16`
    - typings.multicodec.multicodecStrings.`blake2s-24`
    - typings.multicodec.multicodecStrings.`blake2s-32`
    - typings.multicodec.multicodecStrings.`blake2s-40`
    - typings.multicodec.multicodecStrings.`blake2s-48`
    - typings.multicodec.multicodecStrings.`blake2s-56`
    - typings.multicodec.multicodecStrings.`blake2s-64`
    - typings.multicodec.multicodecStrings.`blake2s-72`
    - typings.multicodec.multicodecStrings.`blake2s-80`
    - typings.multicodec.multicodecStrings.`blake2s-88`
    - typings.multicodec.multicodecStrings.`blake2s-96`
    - typings.multicodec.multicodecStrings.`blake2s-104`
    - typings.multicodec.multicodecStrings.`blake2s-112`
    - typings.multicodec.multicodecStrings.`blake2s-120`
    - typings.multicodec.multicodecStrings.`blake2s-128`
    - typings.multicodec.multicodecStrings.`blake2s-136`
    - typings.multicodec.multicodecStrings.`blake2s-144`
    - typings.multicodec.multicodecStrings.`blake2s-152`
    - typings.multicodec.multicodecStrings.`blake2s-160`
    - typings.multicodec.multicodecStrings.`blake2s-168`
    - typings.multicodec.multicodecStrings.`blake2s-176`
    - typings.multicodec.multicodecStrings.`blake2s-184`
    - typings.multicodec.multicodecStrings.`blake2s-192`
    - typings.multicodec.multicodecStrings.`blake2s-200`
    - typings.multicodec.multicodecStrings.`blake2s-208`
    - typings.multicodec.multicodecStrings.`blake2s-216`
    - typings.multicodec.multicodecStrings.`blake2s-224`
    - typings.multicodec.multicodecStrings.`blake2s-232`
    - typings.multicodec.multicodecStrings.`blake2s-240`
    - typings.multicodec.multicodecStrings.`blake2s-248`
    - typings.multicodec.multicodecStrings.`blake2s-256`
    - typings.multicodec.multicodecStrings.`skein256-8`
    - typings.multicodec.multicodecStrings.`skein256-16`
    - typings.multicodec.multicodecStrings.`skein256-24`
    - typings.multicodec.multicodecStrings.`skein256-32`
    - typings.multicodec.multicodecStrings.`skein256-40`
    - typings.multicodec.multicodecStrings.`skein256-48`
    - typings.multicodec.multicodecStrings.`skein256-56`
    - typings.multicodec.multicodecStrings.`skein256-64`
    - typings.multicodec.multicodecStrings.`skein256-72`
    - typings.multicodec.multicodecStrings.`skein256-80`
    - typings.multicodec.multicodecStrings.`skein256-88`
    - typings.multicodec.multicodecStrings.`skein256-96`
    - typings.multicodec.multicodecStrings.`skein256-104`
    - typings.multicodec.multicodecStrings.`skein256-112`
    - typings.multicodec.multicodecStrings.`skein256-120`
    - typings.multicodec.multicodecStrings.`skein256-128`
    - typings.multicodec.multicodecStrings.`skein256-136`
    - typings.multicodec.multicodecStrings.`skein256-144`
    - typings.multicodec.multicodecStrings.`skein256-152`
    - typings.multicodec.multicodecStrings.`skein256-160`
    - typings.multicodec.multicodecStrings.`skein256-168`
    - typings.multicodec.multicodecStrings.`skein256-176`
    - typings.multicodec.multicodecStrings.`skein256-184`
    - typings.multicodec.multicodecStrings.`skein256-192`
    - typings.multicodec.multicodecStrings.`skein256-200`
    - typings.multicodec.multicodecStrings.`skein256-208`
    - typings.multicodec.multicodecStrings.`skein256-216`
    - typings.multicodec.multicodecStrings.`skein256-224`
    - typings.multicodec.multicodecStrings.`skein256-232`
    - typings.multicodec.multicodecStrings.`skein256-240`
    - typings.multicodec.multicodecStrings.`skein256-248`
    - typings.multicodec.multicodecStrings.`skein256-256`
    - typings.multicodec.multicodecStrings.`skein512-8`
    - typings.multicodec.multicodecStrings.`skein512-16`
    - typings.multicodec.multicodecStrings.`skein512-24`
    - typings.multicodec.multicodecStrings.`skein512-32`
    - typings.multicodec.multicodecStrings.`skein512-40`
    - typings.multicodec.multicodecStrings.`skein512-48`
    - typings.multicodec.multicodecStrings.`skein512-56`
    - typings.multicodec.multicodecStrings.`skein512-64`
    - typings.multicodec.multicodecStrings.`skein512-72`
    - typings.multicodec.multicodecStrings.`skein512-80`
    - typings.multicodec.multicodecStrings.`skein512-88`
    - typings.multicodec.multicodecStrings.`skein512-96`
    - typings.multicodec.multicodecStrings.`skein512-104`
    - typings.multicodec.multicodecStrings.`skein512-112`
    - typings.multicodec.multicodecStrings.`skein512-120`
    - typings.multicodec.multicodecStrings.`skein512-128`
    - typings.multicodec.multicodecStrings.`skein512-136`
    - typings.multicodec.multicodecStrings.`skein512-144`
    - typings.multicodec.multicodecStrings.`skein512-152`
    - typings.multicodec.multicodecStrings.`skein512-160`
    - typings.multicodec.multicodecStrings.`skein512-168`
    - typings.multicodec.multicodecStrings.`skein512-176`
    - typings.multicodec.multicodecStrings.`skein512-184`
    - typings.multicodec.multicodecStrings.`skein512-192`
    - typings.multicodec.multicodecStrings.`skein512-200`
    - typings.multicodec.multicodecStrings.`skein512-208`
    - typings.multicodec.multicodecStrings.`skein512-216`
    - typings.multicodec.multicodecStrings.`skein512-224`
    - typings.multicodec.multicodecStrings.`skein512-232`
    - typings.multicodec.multicodecStrings.`skein512-240`
    - typings.multicodec.multicodecStrings.`skein512-248`
    - typings.multicodec.multicodecStrings.`skein512-256`
    - typings.multicodec.multicodecStrings.`skein512-264`
    - typings.multicodec.multicodecStrings.`skein512-272`
    - typings.multicodec.multicodecStrings.`skein512-280`
    - typings.multicodec.multicodecStrings.`skein512-288`
    - typings.multicodec.multicodecStrings.`skein512-296`
    - typings.multicodec.multicodecStrings.`skein512-304`
    - typings.multicodec.multicodecStrings.`skein512-312`
    - typings.multicodec.multicodecStrings.`skein512-320`
    - typings.multicodec.multicodecStrings.`skein512-328`
    - typings.multicodec.multicodecStrings.`skein512-336`
    - typings.multicodec.multicodecStrings.`skein512-344`
    - typings.multicodec.multicodecStrings.`skein512-352`
    - typings.multicodec.multicodecStrings.`skein512-360`
    - typings.multicodec.multicodecStrings.`skein512-368`
    - typings.multicodec.multicodecStrings.`skein512-376`
    - typings.multicodec.multicodecStrings.`skein512-384`
    - typings.multicodec.multicodecStrings.`skein512-392`
    - typings.multicodec.multicodecStrings.`skein512-400`
    - typings.multicodec.multicodecStrings.`skein512-408`
    - typings.multicodec.multicodecStrings.`skein512-416`
    - typings.multicodec.multicodecStrings.`skein512-424`
    - typings.multicodec.multicodecStrings.`skein512-432`
    - typings.multicodec.multicodecStrings.`skein512-440`
    - typings.multicodec.multicodecStrings.`skein512-448`
    - typings.multicodec.multicodecStrings.`skein512-456`
    - typings.multicodec.multicodecStrings.`skein512-464`
    - typings.multicodec.multicodecStrings.`skein512-472`
    - typings.multicodec.multicodecStrings.`skein512-480`
    - typings.multicodec.multicodecStrings.`skein512-488`
    - typings.multicodec.multicodecStrings.`skein512-496`
    - typings.multicodec.multicodecStrings.`skein512-504`
    - typings.multicodec.multicodecStrings.`skein512-512`
    - typings.multicodec.multicodecStrings.`skein1024-8`
    - typings.multicodec.multicodecStrings.`skein1024-16`
    - typings.multicodec.multicodecStrings.`skein1024-24`
    - typings.multicodec.multicodecStrings.`skein1024-32`
    - typings.multicodec.multicodecStrings.`skein1024-40`
    - typings.multicodec.multicodecStrings.`skein1024-48`
    - typings.multicodec.multicodecStrings.`skein1024-56`
    - typings.multicodec.multicodecStrings.`skein1024-64`
    - typings.multicodec.multicodecStrings.`skein1024-72`
    - typings.multicodec.multicodecStrings.`skein1024-80`
    - typings.multicodec.multicodecStrings.`skein1024-88`
    - typings.multicodec.multicodecStrings.`skein1024-96`
    - typings.multicodec.multicodecStrings.`skein1024-104`
    - typings.multicodec.multicodecStrings.`skein1024-112`
    - typings.multicodec.multicodecStrings.`skein1024-120`
    - typings.multicodec.multicodecStrings.`skein1024-128`
    - typings.multicodec.multicodecStrings.`skein1024-136`
    - typings.multicodec.multicodecStrings.`skein1024-144`
    - typings.multicodec.multicodecStrings.`skein1024-152`
    - typings.multicodec.multicodecStrings.`skein1024-160`
    - typings.multicodec.multicodecStrings.`skein1024-168`
    - typings.multicodec.multicodecStrings.`skein1024-176`
    - typings.multicodec.multicodecStrings.`skein1024-184`
    - typings.multicodec.multicodecStrings.`skein1024-192`
    - typings.multicodec.multicodecStrings.`skein1024-200`
    - typings.multicodec.multicodecStrings.`skein1024-208`
    - typings.multicodec.multicodecStrings.`skein1024-216`
    - typings.multicodec.multicodecStrings.`skein1024-224`
    - typings.multicodec.multicodecStrings.`skein1024-232`
    - typings.multicodec.multicodecStrings.`skein1024-240`
    - typings.multicodec.multicodecStrings.`skein1024-248`
    - typings.multicodec.multicodecStrings.`skein1024-256`
    - typings.multicodec.multicodecStrings.`skein1024-264`
    - typings.multicodec.multicodecStrings.`skein1024-272`
    - typings.multicodec.multicodecStrings.`skein1024-280`
    - typings.multicodec.multicodecStrings.`skein1024-288`
    - typings.multicodec.multicodecStrings.`skein1024-296`
    - typings.multicodec.multicodecStrings.`skein1024-304`
    - typings.multicodec.multicodecStrings.`skein1024-312`
    - typings.multicodec.multicodecStrings.`skein1024-320`
    - typings.multicodec.multicodecStrings.`skein1024-328`
    - typings.multicodec.multicodecStrings.`skein1024-336`
    - typings.multicodec.multicodecStrings.`skein1024-344`
    - typings.multicodec.multicodecStrings.`skein1024-352`
    - typings.multicodec.multicodecStrings.`skein1024-360`
    - typings.multicodec.multicodecStrings.`skein1024-368`
    - typings.multicodec.multicodecStrings.`skein1024-376`
    - typings.multicodec.multicodecStrings.`skein1024-384`
    - typings.multicodec.multicodecStrings.`skein1024-392`
    - typings.multicodec.multicodecStrings.`skein1024-400`
    - typings.multicodec.multicodecStrings.`skein1024-408`
    - typings.multicodec.multicodecStrings.`skein1024-416`
    - typings.multicodec.multicodecStrings.`skein1024-424`
    - typings.multicodec.multicodecStrings.`skein1024-432`
    - typings.multicodec.multicodecStrings.`skein1024-440`
    - typings.multicodec.multicodecStrings.`skein1024-448`
    - typings.multicodec.multicodecStrings.`skein1024-456`
    - typings.multicodec.multicodecStrings.`skein1024-464`
    - typings.multicodec.multicodecStrings.`skein1024-472`
    - typings.multicodec.multicodecStrings.`skein1024-480`
    - typings.multicodec.multicodecStrings.`skein1024-488`
    - typings.multicodec.multicodecStrings.`skein1024-496`
    - typings.multicodec.multicodecStrings.`skein1024-504`
    - typings.multicodec.multicodecStrings.`skein1024-512`
    - typings.multicodec.multicodecStrings.`skein1024-520`
    - typings.multicodec.multicodecStrings.`skein1024-528`
    - typings.multicodec.multicodecStrings.`skein1024-536`
    - typings.multicodec.multicodecStrings.`skein1024-544`
    - typings.multicodec.multicodecStrings.`skein1024-552`
    - typings.multicodec.multicodecStrings.`skein1024-560`
    - typings.multicodec.multicodecStrings.`skein1024-568`
    - typings.multicodec.multicodecStrings.`skein1024-576`
    - typings.multicodec.multicodecStrings.`skein1024-584`
    - typings.multicodec.multicodecStrings.`skein1024-592`
    - typings.multicodec.multicodecStrings.`skein1024-600`
    - typings.multicodec.multicodecStrings.`skein1024-608`
    - typings.multicodec.multicodecStrings.`skein1024-616`
    - typings.multicodec.multicodecStrings.`skein1024-624`
    - typings.multicodec.multicodecStrings.`skein1024-632`
    - typings.multicodec.multicodecStrings.`skein1024-640`
    - typings.multicodec.multicodecStrings.`skein1024-648`
    - typings.multicodec.multicodecStrings.`skein1024-656`
    - typings.multicodec.multicodecStrings.`skein1024-664`
    - typings.multicodec.multicodecStrings.`skein1024-672`
    - typings.multicodec.multicodecStrings.`skein1024-680`
    - typings.multicodec.multicodecStrings.`skein1024-688`
    - typings.multicodec.multicodecStrings.`skein1024-696`
    - typings.multicodec.multicodecStrings.`skein1024-704`
    - typings.multicodec.multicodecStrings.`skein1024-712`
    - typings.multicodec.multicodecStrings.`skein1024-720`
    - typings.multicodec.multicodecStrings.`skein1024-728`
    - typings.multicodec.multicodecStrings.`skein1024-736`
    - typings.multicodec.multicodecStrings.`skein1024-744`
    - typings.multicodec.multicodecStrings.`skein1024-752`
    - typings.multicodec.multicodecStrings.`skein1024-760`
    - typings.multicodec.multicodecStrings.`skein1024-768`
    - typings.multicodec.multicodecStrings.`skein1024-776`
    - typings.multicodec.multicodecStrings.`skein1024-784`
    - typings.multicodec.multicodecStrings.`skein1024-792`
    - typings.multicodec.multicodecStrings.`skein1024-800`
    - typings.multicodec.multicodecStrings.`skein1024-808`
    - typings.multicodec.multicodecStrings.`skein1024-816`
    - typings.multicodec.multicodecStrings.`skein1024-824`
    - typings.multicodec.multicodecStrings.`skein1024-832`
    - typings.multicodec.multicodecStrings.`skein1024-840`
    - typings.multicodec.multicodecStrings.`skein1024-848`
    - typings.multicodec.multicodecStrings.`skein1024-856`
    - typings.multicodec.multicodecStrings.`skein1024-864`
    - typings.multicodec.multicodecStrings.`skein1024-872`
    - typings.multicodec.multicodecStrings.`skein1024-880`
    - typings.multicodec.multicodecStrings.`skein1024-888`
    - typings.multicodec.multicodecStrings.`skein1024-896`
    - typings.multicodec.multicodecStrings.`skein1024-904`
    - typings.multicodec.multicodecStrings.`skein1024-912`
    - typings.multicodec.multicodecStrings.`skein1024-920`
    - typings.multicodec.multicodecStrings.`skein1024-928`
    - typings.multicodec.multicodecStrings.`skein1024-936`
    - typings.multicodec.multicodecStrings.`skein1024-944`
    - typings.multicodec.multicodecStrings.`skein1024-952`
    - typings.multicodec.multicodecStrings.`skein1024-960`
    - typings.multicodec.multicodecStrings.`skein1024-968`
    - typings.multicodec.multicodecStrings.`skein1024-976`
    - typings.multicodec.multicodecStrings.`skein1024-984`
    - typings.multicodec.multicodecStrings.`skein1024-992`
    - typings.multicodec.multicodecStrings.`skein1024-1000`
    - typings.multicodec.multicodecStrings.`skein1024-1008`
    - typings.multicodec.multicodecStrings.`skein1024-1016`
    - typings.multicodec.multicodecStrings.`skein1024-1024`
    - typings.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1`
    - typings.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1-sc`
    - typings.multicodec.multicodecStrings.`zeroxcert-imprint-256`
    - typings.multicodec.multicodecStrings.`fil-commitment-unsealed`
    - typings.multicodec.multicodecStrings.`fil-commitment-sealed`
    - typings.multicodec.multicodecStrings.`holochain-adr-v0`
    - typings.multicodec.multicodecStrings.`holochain-adr-v1`
    - typings.multicodec.multicodecStrings.`holochain-key-v0`
    - typings.multicodec.multicodecStrings.`holochain-key-v1`
    - typings.multicodec.multicodecStrings.`holochain-sig-v0`
    - typings.multicodec.multicodecStrings.`holochain-sig-v1`
    - typings.multicodec.multicodecStrings.`skynet-ns`
    - typings.multicodec.multicodecStrings.`arweave-ns`
  */
  trait CodecName extends StObject
  object CodecName {
    
    inline def `arweave-ns`: typings.multicodec.multicodecStrings.`arweave-ns` = "arweave-ns".asInstanceOf[typings.multicodec.multicodecStrings.`arweave-ns`]
    
    inline def bencode: bencode_ = "bencode".asInstanceOf[bencode_]
    
    inline def `bitcoin-block`: typings.multicodec.multicodecStrings.`bitcoin-block` = "bitcoin-block".asInstanceOf[typings.multicodec.multicodecStrings.`bitcoin-block`]
    
    inline def `bitcoin-tx`: typings.multicodec.multicodecStrings.`bitcoin-tx` = "bitcoin-tx".asInstanceOf[typings.multicodec.multicodecStrings.`bitcoin-tx`]
    
    inline def `bitcoin-witness-commitment`: typings.multicodec.multicodecStrings.`bitcoin-witness-commitment` = "bitcoin-witness-commitment".asInstanceOf[typings.multicodec.multicodecStrings.`bitcoin-witness-commitment`]
    
    inline def `blake2b-104`: typings.multicodec.multicodecStrings.`blake2b-104` = "blake2b-104".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-104`]
    
    inline def `blake2b-112`: typings.multicodec.multicodecStrings.`blake2b-112` = "blake2b-112".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-112`]
    
    inline def `blake2b-120`: typings.multicodec.multicodecStrings.`blake2b-120` = "blake2b-120".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-120`]
    
    inline def `blake2b-128`: typings.multicodec.multicodecStrings.`blake2b-128` = "blake2b-128".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-128`]
    
    inline def `blake2b-136`: typings.multicodec.multicodecStrings.`blake2b-136` = "blake2b-136".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-136`]
    
    inline def `blake2b-144`: typings.multicodec.multicodecStrings.`blake2b-144` = "blake2b-144".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-144`]
    
    inline def `blake2b-152`: typings.multicodec.multicodecStrings.`blake2b-152` = "blake2b-152".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-152`]
    
    inline def `blake2b-16`: typings.multicodec.multicodecStrings.`blake2b-16` = "blake2b-16".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-16`]
    
    inline def `blake2b-160`: typings.multicodec.multicodecStrings.`blake2b-160` = "blake2b-160".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-160`]
    
    inline def `blake2b-168`: typings.multicodec.multicodecStrings.`blake2b-168` = "blake2b-168".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-168`]
    
    inline def `blake2b-176`: typings.multicodec.multicodecStrings.`blake2b-176` = "blake2b-176".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-176`]
    
    inline def `blake2b-184`: typings.multicodec.multicodecStrings.`blake2b-184` = "blake2b-184".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-184`]
    
    inline def `blake2b-192`: typings.multicodec.multicodecStrings.`blake2b-192` = "blake2b-192".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-192`]
    
    inline def `blake2b-200`: typings.multicodec.multicodecStrings.`blake2b-200` = "blake2b-200".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-200`]
    
    inline def `blake2b-208`: typings.multicodec.multicodecStrings.`blake2b-208` = "blake2b-208".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-208`]
    
    inline def `blake2b-216`: typings.multicodec.multicodecStrings.`blake2b-216` = "blake2b-216".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-216`]
    
    inline def `blake2b-224`: typings.multicodec.multicodecStrings.`blake2b-224` = "blake2b-224".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-224`]
    
    inline def `blake2b-232`: typings.multicodec.multicodecStrings.`blake2b-232` = "blake2b-232".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-232`]
    
    inline def `blake2b-24`: typings.multicodec.multicodecStrings.`blake2b-24` = "blake2b-24".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-24`]
    
    inline def `blake2b-240`: typings.multicodec.multicodecStrings.`blake2b-240` = "blake2b-240".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-240`]
    
    inline def `blake2b-248`: typings.multicodec.multicodecStrings.`blake2b-248` = "blake2b-248".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-248`]
    
    inline def `blake2b-256`: typings.multicodec.multicodecStrings.`blake2b-256` = "blake2b-256".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-256`]
    
    inline def `blake2b-264`: typings.multicodec.multicodecStrings.`blake2b-264` = "blake2b-264".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-264`]
    
    inline def `blake2b-272`: typings.multicodec.multicodecStrings.`blake2b-272` = "blake2b-272".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-272`]
    
    inline def `blake2b-280`: typings.multicodec.multicodecStrings.`blake2b-280` = "blake2b-280".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-280`]
    
    inline def `blake2b-288`: typings.multicodec.multicodecStrings.`blake2b-288` = "blake2b-288".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-288`]
    
    inline def `blake2b-296`: typings.multicodec.multicodecStrings.`blake2b-296` = "blake2b-296".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-296`]
    
    inline def `blake2b-304`: typings.multicodec.multicodecStrings.`blake2b-304` = "blake2b-304".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-304`]
    
    inline def `blake2b-312`: typings.multicodec.multicodecStrings.`blake2b-312` = "blake2b-312".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-312`]
    
    inline def `blake2b-32`: typings.multicodec.multicodecStrings.`blake2b-32` = "blake2b-32".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-32`]
    
    inline def `blake2b-320`: typings.multicodec.multicodecStrings.`blake2b-320` = "blake2b-320".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-320`]
    
    inline def `blake2b-328`: typings.multicodec.multicodecStrings.`blake2b-328` = "blake2b-328".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-328`]
    
    inline def `blake2b-336`: typings.multicodec.multicodecStrings.`blake2b-336` = "blake2b-336".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-336`]
    
    inline def `blake2b-344`: typings.multicodec.multicodecStrings.`blake2b-344` = "blake2b-344".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-344`]
    
    inline def `blake2b-352`: typings.multicodec.multicodecStrings.`blake2b-352` = "blake2b-352".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-352`]
    
    inline def `blake2b-360`: typings.multicodec.multicodecStrings.`blake2b-360` = "blake2b-360".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-360`]
    
    inline def `blake2b-368`: typings.multicodec.multicodecStrings.`blake2b-368` = "blake2b-368".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-368`]
    
    inline def `blake2b-376`: typings.multicodec.multicodecStrings.`blake2b-376` = "blake2b-376".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-376`]
    
    inline def `blake2b-384`: typings.multicodec.multicodecStrings.`blake2b-384` = "blake2b-384".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-384`]
    
    inline def `blake2b-392`: typings.multicodec.multicodecStrings.`blake2b-392` = "blake2b-392".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-392`]
    
    inline def `blake2b-40`: typings.multicodec.multicodecStrings.`blake2b-40` = "blake2b-40".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-40`]
    
    inline def `blake2b-400`: typings.multicodec.multicodecStrings.`blake2b-400` = "blake2b-400".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-400`]
    
    inline def `blake2b-408`: typings.multicodec.multicodecStrings.`blake2b-408` = "blake2b-408".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-408`]
    
    inline def `blake2b-416`: typings.multicodec.multicodecStrings.`blake2b-416` = "blake2b-416".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-416`]
    
    inline def `blake2b-424`: typings.multicodec.multicodecStrings.`blake2b-424` = "blake2b-424".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-424`]
    
    inline def `blake2b-432`: typings.multicodec.multicodecStrings.`blake2b-432` = "blake2b-432".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-432`]
    
    inline def `blake2b-440`: typings.multicodec.multicodecStrings.`blake2b-440` = "blake2b-440".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-440`]
    
    inline def `blake2b-448`: typings.multicodec.multicodecStrings.`blake2b-448` = "blake2b-448".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-448`]
    
    inline def `blake2b-456`: typings.multicodec.multicodecStrings.`blake2b-456` = "blake2b-456".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-456`]
    
    inline def `blake2b-464`: typings.multicodec.multicodecStrings.`blake2b-464` = "blake2b-464".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-464`]
    
    inline def `blake2b-472`: typings.multicodec.multicodecStrings.`blake2b-472` = "blake2b-472".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-472`]
    
    inline def `blake2b-48`: typings.multicodec.multicodecStrings.`blake2b-48` = "blake2b-48".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-48`]
    
    inline def `blake2b-480`: typings.multicodec.multicodecStrings.`blake2b-480` = "blake2b-480".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-480`]
    
    inline def `blake2b-488`: typings.multicodec.multicodecStrings.`blake2b-488` = "blake2b-488".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-488`]
    
    inline def `blake2b-496`: typings.multicodec.multicodecStrings.`blake2b-496` = "blake2b-496".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-496`]
    
    inline def `blake2b-504`: typings.multicodec.multicodecStrings.`blake2b-504` = "blake2b-504".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-504`]
    
    inline def `blake2b-512`: typings.multicodec.multicodecStrings.`blake2b-512` = "blake2b-512".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-512`]
    
    inline def `blake2b-56`: typings.multicodec.multicodecStrings.`blake2b-56` = "blake2b-56".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-56`]
    
    inline def `blake2b-64`: typings.multicodec.multicodecStrings.`blake2b-64` = "blake2b-64".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-64`]
    
    inline def `blake2b-72`: typings.multicodec.multicodecStrings.`blake2b-72` = "blake2b-72".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-72`]
    
    inline def `blake2b-8`: typings.multicodec.multicodecStrings.`blake2b-8` = "blake2b-8".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-8`]
    
    inline def `blake2b-80`: typings.multicodec.multicodecStrings.`blake2b-80` = "blake2b-80".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-80`]
    
    inline def `blake2b-88`: typings.multicodec.multicodecStrings.`blake2b-88` = "blake2b-88".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-88`]
    
    inline def `blake2b-96`: typings.multicodec.multicodecStrings.`blake2b-96` = "blake2b-96".asInstanceOf[typings.multicodec.multicodecStrings.`blake2b-96`]
    
    inline def `blake2s-104`: typings.multicodec.multicodecStrings.`blake2s-104` = "blake2s-104".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-104`]
    
    inline def `blake2s-112`: typings.multicodec.multicodecStrings.`blake2s-112` = "blake2s-112".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-112`]
    
    inline def `blake2s-120`: typings.multicodec.multicodecStrings.`blake2s-120` = "blake2s-120".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-120`]
    
    inline def `blake2s-128`: typings.multicodec.multicodecStrings.`blake2s-128` = "blake2s-128".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-128`]
    
    inline def `blake2s-136`: typings.multicodec.multicodecStrings.`blake2s-136` = "blake2s-136".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-136`]
    
    inline def `blake2s-144`: typings.multicodec.multicodecStrings.`blake2s-144` = "blake2s-144".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-144`]
    
    inline def `blake2s-152`: typings.multicodec.multicodecStrings.`blake2s-152` = "blake2s-152".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-152`]
    
    inline def `blake2s-16`: typings.multicodec.multicodecStrings.`blake2s-16` = "blake2s-16".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-16`]
    
    inline def `blake2s-160`: typings.multicodec.multicodecStrings.`blake2s-160` = "blake2s-160".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-160`]
    
    inline def `blake2s-168`: typings.multicodec.multicodecStrings.`blake2s-168` = "blake2s-168".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-168`]
    
    inline def `blake2s-176`: typings.multicodec.multicodecStrings.`blake2s-176` = "blake2s-176".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-176`]
    
    inline def `blake2s-184`: typings.multicodec.multicodecStrings.`blake2s-184` = "blake2s-184".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-184`]
    
    inline def `blake2s-192`: typings.multicodec.multicodecStrings.`blake2s-192` = "blake2s-192".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-192`]
    
    inline def `blake2s-200`: typings.multicodec.multicodecStrings.`blake2s-200` = "blake2s-200".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-200`]
    
    inline def `blake2s-208`: typings.multicodec.multicodecStrings.`blake2s-208` = "blake2s-208".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-208`]
    
    inline def `blake2s-216`: typings.multicodec.multicodecStrings.`blake2s-216` = "blake2s-216".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-216`]
    
    inline def `blake2s-224`: typings.multicodec.multicodecStrings.`blake2s-224` = "blake2s-224".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-224`]
    
    inline def `blake2s-232`: typings.multicodec.multicodecStrings.`blake2s-232` = "blake2s-232".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-232`]
    
    inline def `blake2s-24`: typings.multicodec.multicodecStrings.`blake2s-24` = "blake2s-24".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-24`]
    
    inline def `blake2s-240`: typings.multicodec.multicodecStrings.`blake2s-240` = "blake2s-240".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-240`]
    
    inline def `blake2s-248`: typings.multicodec.multicodecStrings.`blake2s-248` = "blake2s-248".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-248`]
    
    inline def `blake2s-256`: typings.multicodec.multicodecStrings.`blake2s-256` = "blake2s-256".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-256`]
    
    inline def `blake2s-32`: typings.multicodec.multicodecStrings.`blake2s-32` = "blake2s-32".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-32`]
    
    inline def `blake2s-40`: typings.multicodec.multicodecStrings.`blake2s-40` = "blake2s-40".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-40`]
    
    inline def `blake2s-48`: typings.multicodec.multicodecStrings.`blake2s-48` = "blake2s-48".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-48`]
    
    inline def `blake2s-56`: typings.multicodec.multicodecStrings.`blake2s-56` = "blake2s-56".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-56`]
    
    inline def `blake2s-64`: typings.multicodec.multicodecStrings.`blake2s-64` = "blake2s-64".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-64`]
    
    inline def `blake2s-72`: typings.multicodec.multicodecStrings.`blake2s-72` = "blake2s-72".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-72`]
    
    inline def `blake2s-8`: typings.multicodec.multicodecStrings.`blake2s-8` = "blake2s-8".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-8`]
    
    inline def `blake2s-80`: typings.multicodec.multicodecStrings.`blake2s-80` = "blake2s-80".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-80`]
    
    inline def `blake2s-88`: typings.multicodec.multicodecStrings.`blake2s-88` = "blake2s-88".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-88`]
    
    inline def `blake2s-96`: typings.multicodec.multicodecStrings.`blake2s-96` = "blake2s-96".asInstanceOf[typings.multicodec.multicodecStrings.`blake2s-96`]
    
    inline def blake3: blake3_ = "blake3".asInstanceOf[blake3_]
    
    inline def `bls12_381-g1-pub`: typings.multicodec.multicodecStrings.`bls12_381-g1-pub` = "bls12_381-g1-pub".asInstanceOf[typings.multicodec.multicodecStrings.`bls12_381-g1-pub`]
    
    inline def `bls12_381-g1g2-pub`: typings.multicodec.multicodecStrings.`bls12_381-g1g2-pub` = "bls12_381-g1g2-pub".asInstanceOf[typings.multicodec.multicodecStrings.`bls12_381-g1g2-pub`]
    
    inline def `bls12_381-g2-pub`: typings.multicodec.multicodecStrings.`bls12_381-g2-pub` = "bls12_381-g2-pub".asInstanceOf[typings.multicodec.multicodecStrings.`bls12_381-g2-pub`]
    
    inline def bmt: bmt_ = "bmt".asInstanceOf[bmt_]
    
    inline def `caip-50`: typings.multicodec.multicodecStrings.`caip-50` = "caip-50".asInstanceOf[typings.multicodec.multicodecStrings.`caip-50`]
    
    inline def `car-index-sorted`: typings.multicodec.multicodecStrings.`car-index-sorted` = "car-index-sorted".asInstanceOf[typings.multicodec.multicodecStrings.`car-index-sorted`]
    
    inline def cbor: cbor_ = "cbor".asInstanceOf[cbor_]
    
    inline def cidv1: cidv1_ = "cidv1".asInstanceOf[cidv1_]
    
    inline def cidv2: cidv2_ = "cidv2".asInstanceOf[cidv2_]
    
    inline def cidv3: cidv3_ = "cidv3".asInstanceOf[cidv3_]
    
    inline def `dag-cbor`: typings.multicodec.multicodecStrings.`dag-cbor` = "dag-cbor".asInstanceOf[typings.multicodec.multicodecStrings.`dag-cbor`]
    
    inline def `dag-cose`: typings.multicodec.multicodecStrings.`dag-cose` = "dag-cose".asInstanceOf[typings.multicodec.multicodecStrings.`dag-cose`]
    
    inline def `dag-jose`: typings.multicodec.multicodecStrings.`dag-jose` = "dag-jose".asInstanceOf[typings.multicodec.multicodecStrings.`dag-jose`]
    
    inline def `dag-json`: typings.multicodec.multicodecStrings.`dag-json` = "dag-json".asInstanceOf[typings.multicodec.multicodecStrings.`dag-json`]
    
    inline def `dag-pb`: typings.multicodec.multicodecStrings.`dag-pb` = "dag-pb".asInstanceOf[typings.multicodec.multicodecStrings.`dag-pb`]
    
    inline def `dash-block`: typings.multicodec.multicodecStrings.`dash-block` = "dash-block".asInstanceOf[typings.multicodec.multicodecStrings.`dash-block`]
    
    inline def `dash-tx`: typings.multicodec.multicodecStrings.`dash-tx` = "dash-tx".asInstanceOf[typings.multicodec.multicodecStrings.`dash-tx`]
    
    inline def `dbl-sha2-256`: typings.multicodec.multicodecStrings.`dbl-sha2-256` = "dbl-sha2-256".asInstanceOf[typings.multicodec.multicodecStrings.`dbl-sha2-256`]
    
    inline def dccp: dccp_ = "dccp".asInstanceOf[dccp_]
    
    inline def `decred-block`: typings.multicodec.multicodecStrings.`decred-block` = "decred-block".asInstanceOf[typings.multicodec.multicodecStrings.`decred-block`]
    
    inline def `decred-tx`: typings.multicodec.multicodecStrings.`decred-tx` = "decred-tx".asInstanceOf[typings.multicodec.multicodecStrings.`decred-tx`]
    
    inline def dns: dns_ = "dns".asInstanceOf[dns_]
    
    inline def dns4: dns4_ = "dns4".asInstanceOf[dns4_]
    
    inline def dns6: dns6_ = "dns6".asInstanceOf[dns6_]
    
    inline def dnsaddr: dnsaddr_ = "dnsaddr".asInstanceOf[dnsaddr_]
    
    inline def `ed25519-priv`: typings.multicodec.multicodecStrings.`ed25519-priv` = "ed25519-priv".asInstanceOf[typings.multicodec.multicodecStrings.`ed25519-priv`]
    
    inline def `ed25519-pub`: typings.multicodec.multicodecStrings.`ed25519-pub` = "ed25519-pub".asInstanceOf[typings.multicodec.multicodecStrings.`ed25519-pub`]
    
    inline def `ed448-pub`: typings.multicodec.multicodecStrings.`ed448-pub` = "ed448-pub".asInstanceOf[typings.multicodec.multicodecStrings.`ed448-pub`]
    
    inline def `eth-account-snapshot`: typings.multicodec.multicodecStrings.`eth-account-snapshot` = "eth-account-snapshot".asInstanceOf[typings.multicodec.multicodecStrings.`eth-account-snapshot`]
    
    inline def `eth-block`: typings.multicodec.multicodecStrings.`eth-block` = "eth-block".asInstanceOf[typings.multicodec.multicodecStrings.`eth-block`]
    
    inline def `eth-block-list`: typings.multicodec.multicodecStrings.`eth-block-list` = "eth-block-list".asInstanceOf[typings.multicodec.multicodecStrings.`eth-block-list`]
    
    inline def `eth-receipt-log-trie`: typings.multicodec.multicodecStrings.`eth-receipt-log-trie` = "eth-receipt-log-trie".asInstanceOf[typings.multicodec.multicodecStrings.`eth-receipt-log-trie`]
    
    inline def `eth-reciept-log`: typings.multicodec.multicodecStrings.`eth-reciept-log` = "eth-reciept-log".asInstanceOf[typings.multicodec.multicodecStrings.`eth-reciept-log`]
    
    inline def `eth-state-trie`: typings.multicodec.multicodecStrings.`eth-state-trie` = "eth-state-trie".asInstanceOf[typings.multicodec.multicodecStrings.`eth-state-trie`]
    
    inline def `eth-storage-trie`: typings.multicodec.multicodecStrings.`eth-storage-trie` = "eth-storage-trie".asInstanceOf[typings.multicodec.multicodecStrings.`eth-storage-trie`]
    
    inline def `eth-tx`: typings.multicodec.multicodecStrings.`eth-tx` = "eth-tx".asInstanceOf[typings.multicodec.multicodecStrings.`eth-tx`]
    
    inline def `eth-tx-receipt`: typings.multicodec.multicodecStrings.`eth-tx-receipt` = "eth-tx-receipt".asInstanceOf[typings.multicodec.multicodecStrings.`eth-tx-receipt`]
    
    inline def `eth-tx-receipt-trie`: typings.multicodec.multicodecStrings.`eth-tx-receipt-trie` = "eth-tx-receipt-trie".asInstanceOf[typings.multicodec.multicodecStrings.`eth-tx-receipt-trie`]
    
    inline def `eth-tx-trie`: typings.multicodec.multicodecStrings.`eth-tx-trie` = "eth-tx-trie".asInstanceOf[typings.multicodec.multicodecStrings.`eth-tx-trie`]
    
    inline def `fil-commitment-sealed`: typings.multicodec.multicodecStrings.`fil-commitment-sealed` = "fil-commitment-sealed".asInstanceOf[typings.multicodec.multicodecStrings.`fil-commitment-sealed`]
    
    inline def `fil-commitment-unsealed`: typings.multicodec.multicodecStrings.`fil-commitment-unsealed` = "fil-commitment-unsealed".asInstanceOf[typings.multicodec.multicodecStrings.`fil-commitment-unsealed`]
    
    inline def garlic32: garlic32_ = "garlic32".asInstanceOf[garlic32_]
    
    inline def garlic64: garlic64_ = "garlic64".asInstanceOf[garlic64_]
    
    inline def `git-raw`: typings.multicodec.multicodecStrings.`git-raw` = "git-raw".asInstanceOf[typings.multicodec.multicodecStrings.`git-raw`]
    
    inline def `holochain-adr-v0`: typings.multicodec.multicodecStrings.`holochain-adr-v0` = "holochain-adr-v0".asInstanceOf[typings.multicodec.multicodecStrings.`holochain-adr-v0`]
    
    inline def `holochain-adr-v1`: typings.multicodec.multicodecStrings.`holochain-adr-v1` = "holochain-adr-v1".asInstanceOf[typings.multicodec.multicodecStrings.`holochain-adr-v1`]
    
    inline def `holochain-key-v0`: typings.multicodec.multicodecStrings.`holochain-key-v0` = "holochain-key-v0".asInstanceOf[typings.multicodec.multicodecStrings.`holochain-key-v0`]
    
    inline def `holochain-key-v1`: typings.multicodec.multicodecStrings.`holochain-key-v1` = "holochain-key-v1".asInstanceOf[typings.multicodec.multicodecStrings.`holochain-key-v1`]
    
    inline def `holochain-sig-v0`: typings.multicodec.multicodecStrings.`holochain-sig-v0` = "holochain-sig-v0".asInstanceOf[typings.multicodec.multicodecStrings.`holochain-sig-v0`]
    
    inline def `holochain-sig-v1`: typings.multicodec.multicodecStrings.`holochain-sig-v1` = "holochain-sig-v1".asInstanceOf[typings.multicodec.multicodecStrings.`holochain-sig-v1`]
    
    inline def http: http_ = "http".asInstanceOf[http_]
    
    inline def https: https_ = "https".asInstanceOf[https_]
    
    inline def identity: identity_ = "identity".asInstanceOf[identity_]
    
    inline def ip4: ip4_ = "ip4".asInstanceOf[ip4_]
    
    inline def ip6: ip6_ = "ip6".asInstanceOf[ip6_]
    
    inline def ip6zone: ip6zone_ = "ip6zone".asInstanceOf[ip6zone_]
    
    inline def ipfs: ipfs_ = "ipfs".asInstanceOf[ipfs_]
    
    inline def `ipfs-ns`: typings.multicodec.multicodecStrings.`ipfs-ns` = "ipfs-ns".asInstanceOf[typings.multicodec.multicodecStrings.`ipfs-ns`]
    
    inline def `ipld-ns`: typings.multicodec.multicodecStrings.`ipld-ns` = "ipld-ns".asInstanceOf[typings.multicodec.multicodecStrings.`ipld-ns`]
    
    inline def `ipns-ns`: typings.multicodec.multicodecStrings.`ipns-ns` = "ipns-ns".asInstanceOf[typings.multicodec.multicodecStrings.`ipns-ns`]
    
    inline def json: json_ = "json".asInstanceOf[json_]
    
    inline def kangarootwelve: kangarootwelve_ = "kangarootwelve".asInstanceOf[kangarootwelve_]
    
    inline def `keccak-224`: typings.multicodec.multicodecStrings.`keccak-224` = "keccak-224".asInstanceOf[typings.multicodec.multicodecStrings.`keccak-224`]
    
    inline def `keccak-256`: typings.multicodec.multicodecStrings.`keccak-256` = "keccak-256".asInstanceOf[typings.multicodec.multicodecStrings.`keccak-256`]
    
    inline def `keccak-384`: typings.multicodec.multicodecStrings.`keccak-384` = "keccak-384".asInstanceOf[typings.multicodec.multicodecStrings.`keccak-384`]
    
    inline def `keccak-512`: typings.multicodec.multicodecStrings.`keccak-512` = "keccak-512".asInstanceOf[typings.multicodec.multicodecStrings.`keccak-512`]
    
    inline def `leofcoin-block`: typings.multicodec.multicodecStrings.`leofcoin-block` = "leofcoin-block".asInstanceOf[typings.multicodec.multicodecStrings.`leofcoin-block`]
    
    inline def `leofcoin-pr`: typings.multicodec.multicodecStrings.`leofcoin-pr` = "leofcoin-pr".asInstanceOf[typings.multicodec.multicodecStrings.`leofcoin-pr`]
    
    inline def `leofcoin-tx`: typings.multicodec.multicodecStrings.`leofcoin-tx` = "leofcoin-tx".asInstanceOf[typings.multicodec.multicodecStrings.`leofcoin-tx`]
    
    inline def `libp2p-key`: typings.multicodec.multicodecStrings.`libp2p-key` = "libp2p-key".asInstanceOf[typings.multicodec.multicodecStrings.`libp2p-key`]
    
    inline def `libp2p-peer-record`: typings.multicodec.multicodecStrings.`libp2p-peer-record` = "libp2p-peer-record".asInstanceOf[typings.multicodec.multicodecStrings.`libp2p-peer-record`]
    
    inline def `libp2p-relay-rsvp`: typings.multicodec.multicodecStrings.`libp2p-relay-rsvp` = "libp2p-relay-rsvp".asInstanceOf[typings.multicodec.multicodecStrings.`libp2p-relay-rsvp`]
    
    inline def md4: md4_ = "md4".asInstanceOf[md4_]
    
    inline def md5: md5_ = "md5".asInstanceOf[md5_]
    
    inline def messagepack: messagepack_ = "messagepack".asInstanceOf[messagepack_]
    
    inline def multiaddr: multiaddr_ = "multiaddr".asInstanceOf[multiaddr_]
    
    inline def multibase: multibase_ = "multibase".asInstanceOf[multibase_]
    
    inline def multicodec: multicodec_ = "multicodec".asInstanceOf[multicodec_]
    
    inline def multihash: multihash_ = "multihash".asInstanceOf[multihash_]
    
    inline def `murmur3-128`: typings.multicodec.multicodecStrings.`murmur3-128` = "murmur3-128".asInstanceOf[typings.multicodec.multicodecStrings.`murmur3-128`]
    
    inline def `murmur3-32`: typings.multicodec.multicodecStrings.`murmur3-32` = "murmur3-32".asInstanceOf[typings.multicodec.multicodecStrings.`murmur3-32`]
    
    inline def noise: noise_ = "noise".asInstanceOf[noise_]
    
    inline def onion: onion_ = "onion".asInstanceOf[onion_]
    
    inline def onion3: onion3_ = "onion3".asInstanceOf[onion3_]
    
    inline def `p256-pub`: typings.multicodec.multicodecStrings.`p256-pub` = "p256-pub".asInstanceOf[typings.multicodec.multicodecStrings.`p256-pub`]
    
    inline def p2p: p2p_ = "p2p".asInstanceOf[p2p_]
    
    inline def `p2p-circuit`: typings.multicodec.multicodecStrings.`p2p-circuit` = "p2p-circuit".asInstanceOf[typings.multicodec.multicodecStrings.`p2p-circuit`]
    
    inline def `p2p-stardust`: typings.multicodec.multicodecStrings.`p2p-stardust` = "p2p-stardust".asInstanceOf[typings.multicodec.multicodecStrings.`p2p-stardust`]
    
    inline def `p2p-webrtc-direct`: typings.multicodec.multicodecStrings.`p2p-webrtc-direct` = "p2p-webrtc-direct".asInstanceOf[typings.multicodec.multicodecStrings.`p2p-webrtc-direct`]
    
    inline def `p2p-webrtc-star`: typings.multicodec.multicodecStrings.`p2p-webrtc-star` = "p2p-webrtc-star".asInstanceOf[typings.multicodec.multicodecStrings.`p2p-webrtc-star`]
    
    inline def `p2p-websocket-star`: typings.multicodec.multicodecStrings.`p2p-websocket-star` = "p2p-websocket-star".asInstanceOf[typings.multicodec.multicodecStrings.`p2p-websocket-star`]
    
    inline def `p384-pub`: typings.multicodec.multicodecStrings.`p384-pub` = "p384-pub".asInstanceOf[typings.multicodec.multicodecStrings.`p384-pub`]
    
    inline def `p521-pub`: typings.multicodec.multicodecStrings.`p521-pub` = "p521-pub".asInstanceOf[typings.multicodec.multicodecStrings.`p521-pub`]
    
    inline def path: path_ = "path".asInstanceOf[path_]
    
    inline def `poseidon-bls12_381-a2-fc1`: typings.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1` = "poseidon-bls12_381-a2-fc1".asInstanceOf[typings.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1`]
    
    inline def `poseidon-bls12_381-a2-fc1-sc`: typings.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1-sc` = "poseidon-bls12_381-a2-fc1-sc".asInstanceOf[typings.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1-sc`]
    
    inline def protobuf: protobuf_ = "protobuf".asInstanceOf[protobuf_]
    
    inline def quic: quic_ = "quic".asInstanceOf[quic_]
    
    inline def raw: raw_ = "raw".asInstanceOf[raw_]
    
    inline def `ripemd-128`: typings.multicodec.multicodecStrings.`ripemd-128` = "ripemd-128".asInstanceOf[typings.multicodec.multicodecStrings.`ripemd-128`]
    
    inline def `ripemd-160`: typings.multicodec.multicodecStrings.`ripemd-160` = "ripemd-160".asInstanceOf[typings.multicodec.multicodecStrings.`ripemd-160`]
    
    inline def `ripemd-256`: typings.multicodec.multicodecStrings.`ripemd-256` = "ripemd-256".asInstanceOf[typings.multicodec.multicodecStrings.`ripemd-256`]
    
    inline def `ripemd-320`: typings.multicodec.multicodecStrings.`ripemd-320` = "ripemd-320".asInstanceOf[typings.multicodec.multicodecStrings.`ripemd-320`]
    
    inline def rlp: rlp_ = "rlp".asInstanceOf[rlp_]
    
    inline def sctp: sctp_ = "sctp".asInstanceOf[sctp_]
    
    inline def `secp256k1-priv`: typings.multicodec.multicodecStrings.`secp256k1-priv` = "secp256k1-priv".asInstanceOf[typings.multicodec.multicodecStrings.`secp256k1-priv`]
    
    inline def `secp256k1-pub`: typings.multicodec.multicodecStrings.`secp256k1-pub` = "secp256k1-pub".asInstanceOf[typings.multicodec.multicodecStrings.`secp256k1-pub`]
    
    inline def sha1: sha1_ = "sha1".asInstanceOf[sha1_]
    
    inline def `sha2-256`: typings.multicodec.multicodecStrings.`sha2-256` = "sha2-256".asInstanceOf[typings.multicodec.multicodecStrings.`sha2-256`]
    
    inline def `sha2-256-trunc254-padded`: typings.multicodec.multicodecStrings.`sha2-256-trunc254-padded` = "sha2-256-trunc254-padded".asInstanceOf[typings.multicodec.multicodecStrings.`sha2-256-trunc254-padded`]
    
    inline def `sha2-512`: typings.multicodec.multicodecStrings.`sha2-512` = "sha2-512".asInstanceOf[typings.multicodec.multicodecStrings.`sha2-512`]
    
    inline def `sha3-224`: typings.multicodec.multicodecStrings.`sha3-224` = "sha3-224".asInstanceOf[typings.multicodec.multicodecStrings.`sha3-224`]
    
    inline def `sha3-256`: typings.multicodec.multicodecStrings.`sha3-256` = "sha3-256".asInstanceOf[typings.multicodec.multicodecStrings.`sha3-256`]
    
    inline def `sha3-384`: typings.multicodec.multicodecStrings.`sha3-384` = "sha3-384".asInstanceOf[typings.multicodec.multicodecStrings.`sha3-384`]
    
    inline def `sha3-512`: typings.multicodec.multicodecStrings.`sha3-512` = "sha3-512".asInstanceOf[typings.multicodec.multicodecStrings.`sha3-512`]
    
    inline def `shake-128`: typings.multicodec.multicodecStrings.`shake-128` = "shake-128".asInstanceOf[typings.multicodec.multicodecStrings.`shake-128`]
    
    inline def `shake-256`: typings.multicodec.multicodecStrings.`shake-256` = "shake-256".asInstanceOf[typings.multicodec.multicodecStrings.`shake-256`]
    
    inline def `skein1024-1000`: typings.multicodec.multicodecStrings.`skein1024-1000` = "skein1024-1000".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-1000`]
    
    inline def `skein1024-1008`: typings.multicodec.multicodecStrings.`skein1024-1008` = "skein1024-1008".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-1008`]
    
    inline def `skein1024-1016`: typings.multicodec.multicodecStrings.`skein1024-1016` = "skein1024-1016".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-1016`]
    
    inline def `skein1024-1024`: typings.multicodec.multicodecStrings.`skein1024-1024` = "skein1024-1024".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-1024`]
    
    inline def `skein1024-104`: typings.multicodec.multicodecStrings.`skein1024-104` = "skein1024-104".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-104`]
    
    inline def `skein1024-112`: typings.multicodec.multicodecStrings.`skein1024-112` = "skein1024-112".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-112`]
    
    inline def `skein1024-120`: typings.multicodec.multicodecStrings.`skein1024-120` = "skein1024-120".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-120`]
    
    inline def `skein1024-128`: typings.multicodec.multicodecStrings.`skein1024-128` = "skein1024-128".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-128`]
    
    inline def `skein1024-136`: typings.multicodec.multicodecStrings.`skein1024-136` = "skein1024-136".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-136`]
    
    inline def `skein1024-144`: typings.multicodec.multicodecStrings.`skein1024-144` = "skein1024-144".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-144`]
    
    inline def `skein1024-152`: typings.multicodec.multicodecStrings.`skein1024-152` = "skein1024-152".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-152`]
    
    inline def `skein1024-16`: typings.multicodec.multicodecStrings.`skein1024-16` = "skein1024-16".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-16`]
    
    inline def `skein1024-160`: typings.multicodec.multicodecStrings.`skein1024-160` = "skein1024-160".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-160`]
    
    inline def `skein1024-168`: typings.multicodec.multicodecStrings.`skein1024-168` = "skein1024-168".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-168`]
    
    inline def `skein1024-176`: typings.multicodec.multicodecStrings.`skein1024-176` = "skein1024-176".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-176`]
    
    inline def `skein1024-184`: typings.multicodec.multicodecStrings.`skein1024-184` = "skein1024-184".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-184`]
    
    inline def `skein1024-192`: typings.multicodec.multicodecStrings.`skein1024-192` = "skein1024-192".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-192`]
    
    inline def `skein1024-200`: typings.multicodec.multicodecStrings.`skein1024-200` = "skein1024-200".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-200`]
    
    inline def `skein1024-208`: typings.multicodec.multicodecStrings.`skein1024-208` = "skein1024-208".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-208`]
    
    inline def `skein1024-216`: typings.multicodec.multicodecStrings.`skein1024-216` = "skein1024-216".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-216`]
    
    inline def `skein1024-224`: typings.multicodec.multicodecStrings.`skein1024-224` = "skein1024-224".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-224`]
    
    inline def `skein1024-232`: typings.multicodec.multicodecStrings.`skein1024-232` = "skein1024-232".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-232`]
    
    inline def `skein1024-24`: typings.multicodec.multicodecStrings.`skein1024-24` = "skein1024-24".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-24`]
    
    inline def `skein1024-240`: typings.multicodec.multicodecStrings.`skein1024-240` = "skein1024-240".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-240`]
    
    inline def `skein1024-248`: typings.multicodec.multicodecStrings.`skein1024-248` = "skein1024-248".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-248`]
    
    inline def `skein1024-256`: typings.multicodec.multicodecStrings.`skein1024-256` = "skein1024-256".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-256`]
    
    inline def `skein1024-264`: typings.multicodec.multicodecStrings.`skein1024-264` = "skein1024-264".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-264`]
    
    inline def `skein1024-272`: typings.multicodec.multicodecStrings.`skein1024-272` = "skein1024-272".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-272`]
    
    inline def `skein1024-280`: typings.multicodec.multicodecStrings.`skein1024-280` = "skein1024-280".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-280`]
    
    inline def `skein1024-288`: typings.multicodec.multicodecStrings.`skein1024-288` = "skein1024-288".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-288`]
    
    inline def `skein1024-296`: typings.multicodec.multicodecStrings.`skein1024-296` = "skein1024-296".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-296`]
    
    inline def `skein1024-304`: typings.multicodec.multicodecStrings.`skein1024-304` = "skein1024-304".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-304`]
    
    inline def `skein1024-312`: typings.multicodec.multicodecStrings.`skein1024-312` = "skein1024-312".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-312`]
    
    inline def `skein1024-32`: typings.multicodec.multicodecStrings.`skein1024-32` = "skein1024-32".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-32`]
    
    inline def `skein1024-320`: typings.multicodec.multicodecStrings.`skein1024-320` = "skein1024-320".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-320`]
    
    inline def `skein1024-328`: typings.multicodec.multicodecStrings.`skein1024-328` = "skein1024-328".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-328`]
    
    inline def `skein1024-336`: typings.multicodec.multicodecStrings.`skein1024-336` = "skein1024-336".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-336`]
    
    inline def `skein1024-344`: typings.multicodec.multicodecStrings.`skein1024-344` = "skein1024-344".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-344`]
    
    inline def `skein1024-352`: typings.multicodec.multicodecStrings.`skein1024-352` = "skein1024-352".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-352`]
    
    inline def `skein1024-360`: typings.multicodec.multicodecStrings.`skein1024-360` = "skein1024-360".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-360`]
    
    inline def `skein1024-368`: typings.multicodec.multicodecStrings.`skein1024-368` = "skein1024-368".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-368`]
    
    inline def `skein1024-376`: typings.multicodec.multicodecStrings.`skein1024-376` = "skein1024-376".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-376`]
    
    inline def `skein1024-384`: typings.multicodec.multicodecStrings.`skein1024-384` = "skein1024-384".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-384`]
    
    inline def `skein1024-392`: typings.multicodec.multicodecStrings.`skein1024-392` = "skein1024-392".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-392`]
    
    inline def `skein1024-40`: typings.multicodec.multicodecStrings.`skein1024-40` = "skein1024-40".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-40`]
    
    inline def `skein1024-400`: typings.multicodec.multicodecStrings.`skein1024-400` = "skein1024-400".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-400`]
    
    inline def `skein1024-408`: typings.multicodec.multicodecStrings.`skein1024-408` = "skein1024-408".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-408`]
    
    inline def `skein1024-416`: typings.multicodec.multicodecStrings.`skein1024-416` = "skein1024-416".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-416`]
    
    inline def `skein1024-424`: typings.multicodec.multicodecStrings.`skein1024-424` = "skein1024-424".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-424`]
    
    inline def `skein1024-432`: typings.multicodec.multicodecStrings.`skein1024-432` = "skein1024-432".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-432`]
    
    inline def `skein1024-440`: typings.multicodec.multicodecStrings.`skein1024-440` = "skein1024-440".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-440`]
    
    inline def `skein1024-448`: typings.multicodec.multicodecStrings.`skein1024-448` = "skein1024-448".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-448`]
    
    inline def `skein1024-456`: typings.multicodec.multicodecStrings.`skein1024-456` = "skein1024-456".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-456`]
    
    inline def `skein1024-464`: typings.multicodec.multicodecStrings.`skein1024-464` = "skein1024-464".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-464`]
    
    inline def `skein1024-472`: typings.multicodec.multicodecStrings.`skein1024-472` = "skein1024-472".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-472`]
    
    inline def `skein1024-48`: typings.multicodec.multicodecStrings.`skein1024-48` = "skein1024-48".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-48`]
    
    inline def `skein1024-480`: typings.multicodec.multicodecStrings.`skein1024-480` = "skein1024-480".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-480`]
    
    inline def `skein1024-488`: typings.multicodec.multicodecStrings.`skein1024-488` = "skein1024-488".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-488`]
    
    inline def `skein1024-496`: typings.multicodec.multicodecStrings.`skein1024-496` = "skein1024-496".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-496`]
    
    inline def `skein1024-504`: typings.multicodec.multicodecStrings.`skein1024-504` = "skein1024-504".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-504`]
    
    inline def `skein1024-512`: typings.multicodec.multicodecStrings.`skein1024-512` = "skein1024-512".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-512`]
    
    inline def `skein1024-520`: typings.multicodec.multicodecStrings.`skein1024-520` = "skein1024-520".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-520`]
    
    inline def `skein1024-528`: typings.multicodec.multicodecStrings.`skein1024-528` = "skein1024-528".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-528`]
    
    inline def `skein1024-536`: typings.multicodec.multicodecStrings.`skein1024-536` = "skein1024-536".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-536`]
    
    inline def `skein1024-544`: typings.multicodec.multicodecStrings.`skein1024-544` = "skein1024-544".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-544`]
    
    inline def `skein1024-552`: typings.multicodec.multicodecStrings.`skein1024-552` = "skein1024-552".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-552`]
    
    inline def `skein1024-56`: typings.multicodec.multicodecStrings.`skein1024-56` = "skein1024-56".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-56`]
    
    inline def `skein1024-560`: typings.multicodec.multicodecStrings.`skein1024-560` = "skein1024-560".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-560`]
    
    inline def `skein1024-568`: typings.multicodec.multicodecStrings.`skein1024-568` = "skein1024-568".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-568`]
    
    inline def `skein1024-576`: typings.multicodec.multicodecStrings.`skein1024-576` = "skein1024-576".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-576`]
    
    inline def `skein1024-584`: typings.multicodec.multicodecStrings.`skein1024-584` = "skein1024-584".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-584`]
    
    inline def `skein1024-592`: typings.multicodec.multicodecStrings.`skein1024-592` = "skein1024-592".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-592`]
    
    inline def `skein1024-600`: typings.multicodec.multicodecStrings.`skein1024-600` = "skein1024-600".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-600`]
    
    inline def `skein1024-608`: typings.multicodec.multicodecStrings.`skein1024-608` = "skein1024-608".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-608`]
    
    inline def `skein1024-616`: typings.multicodec.multicodecStrings.`skein1024-616` = "skein1024-616".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-616`]
    
    inline def `skein1024-624`: typings.multicodec.multicodecStrings.`skein1024-624` = "skein1024-624".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-624`]
    
    inline def `skein1024-632`: typings.multicodec.multicodecStrings.`skein1024-632` = "skein1024-632".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-632`]
    
    inline def `skein1024-64`: typings.multicodec.multicodecStrings.`skein1024-64` = "skein1024-64".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-64`]
    
    inline def `skein1024-640`: typings.multicodec.multicodecStrings.`skein1024-640` = "skein1024-640".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-640`]
    
    inline def `skein1024-648`: typings.multicodec.multicodecStrings.`skein1024-648` = "skein1024-648".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-648`]
    
    inline def `skein1024-656`: typings.multicodec.multicodecStrings.`skein1024-656` = "skein1024-656".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-656`]
    
    inline def `skein1024-664`: typings.multicodec.multicodecStrings.`skein1024-664` = "skein1024-664".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-664`]
    
    inline def `skein1024-672`: typings.multicodec.multicodecStrings.`skein1024-672` = "skein1024-672".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-672`]
    
    inline def `skein1024-680`: typings.multicodec.multicodecStrings.`skein1024-680` = "skein1024-680".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-680`]
    
    inline def `skein1024-688`: typings.multicodec.multicodecStrings.`skein1024-688` = "skein1024-688".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-688`]
    
    inline def `skein1024-696`: typings.multicodec.multicodecStrings.`skein1024-696` = "skein1024-696".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-696`]
    
    inline def `skein1024-704`: typings.multicodec.multicodecStrings.`skein1024-704` = "skein1024-704".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-704`]
    
    inline def `skein1024-712`: typings.multicodec.multicodecStrings.`skein1024-712` = "skein1024-712".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-712`]
    
    inline def `skein1024-72`: typings.multicodec.multicodecStrings.`skein1024-72` = "skein1024-72".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-72`]
    
    inline def `skein1024-720`: typings.multicodec.multicodecStrings.`skein1024-720` = "skein1024-720".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-720`]
    
    inline def `skein1024-728`: typings.multicodec.multicodecStrings.`skein1024-728` = "skein1024-728".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-728`]
    
    inline def `skein1024-736`: typings.multicodec.multicodecStrings.`skein1024-736` = "skein1024-736".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-736`]
    
    inline def `skein1024-744`: typings.multicodec.multicodecStrings.`skein1024-744` = "skein1024-744".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-744`]
    
    inline def `skein1024-752`: typings.multicodec.multicodecStrings.`skein1024-752` = "skein1024-752".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-752`]
    
    inline def `skein1024-760`: typings.multicodec.multicodecStrings.`skein1024-760` = "skein1024-760".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-760`]
    
    inline def `skein1024-768`: typings.multicodec.multicodecStrings.`skein1024-768` = "skein1024-768".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-768`]
    
    inline def `skein1024-776`: typings.multicodec.multicodecStrings.`skein1024-776` = "skein1024-776".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-776`]
    
    inline def `skein1024-784`: typings.multicodec.multicodecStrings.`skein1024-784` = "skein1024-784".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-784`]
    
    inline def `skein1024-792`: typings.multicodec.multicodecStrings.`skein1024-792` = "skein1024-792".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-792`]
    
    inline def `skein1024-8`: typings.multicodec.multicodecStrings.`skein1024-8` = "skein1024-8".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-8`]
    
    inline def `skein1024-80`: typings.multicodec.multicodecStrings.`skein1024-80` = "skein1024-80".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-80`]
    
    inline def `skein1024-800`: typings.multicodec.multicodecStrings.`skein1024-800` = "skein1024-800".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-800`]
    
    inline def `skein1024-808`: typings.multicodec.multicodecStrings.`skein1024-808` = "skein1024-808".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-808`]
    
    inline def `skein1024-816`: typings.multicodec.multicodecStrings.`skein1024-816` = "skein1024-816".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-816`]
    
    inline def `skein1024-824`: typings.multicodec.multicodecStrings.`skein1024-824` = "skein1024-824".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-824`]
    
    inline def `skein1024-832`: typings.multicodec.multicodecStrings.`skein1024-832` = "skein1024-832".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-832`]
    
    inline def `skein1024-840`: typings.multicodec.multicodecStrings.`skein1024-840` = "skein1024-840".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-840`]
    
    inline def `skein1024-848`: typings.multicodec.multicodecStrings.`skein1024-848` = "skein1024-848".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-848`]
    
    inline def `skein1024-856`: typings.multicodec.multicodecStrings.`skein1024-856` = "skein1024-856".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-856`]
    
    inline def `skein1024-864`: typings.multicodec.multicodecStrings.`skein1024-864` = "skein1024-864".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-864`]
    
    inline def `skein1024-872`: typings.multicodec.multicodecStrings.`skein1024-872` = "skein1024-872".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-872`]
    
    inline def `skein1024-88`: typings.multicodec.multicodecStrings.`skein1024-88` = "skein1024-88".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-88`]
    
    inline def `skein1024-880`: typings.multicodec.multicodecStrings.`skein1024-880` = "skein1024-880".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-880`]
    
    inline def `skein1024-888`: typings.multicodec.multicodecStrings.`skein1024-888` = "skein1024-888".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-888`]
    
    inline def `skein1024-896`: typings.multicodec.multicodecStrings.`skein1024-896` = "skein1024-896".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-896`]
    
    inline def `skein1024-904`: typings.multicodec.multicodecStrings.`skein1024-904` = "skein1024-904".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-904`]
    
    inline def `skein1024-912`: typings.multicodec.multicodecStrings.`skein1024-912` = "skein1024-912".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-912`]
    
    inline def `skein1024-920`: typings.multicodec.multicodecStrings.`skein1024-920` = "skein1024-920".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-920`]
    
    inline def `skein1024-928`: typings.multicodec.multicodecStrings.`skein1024-928` = "skein1024-928".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-928`]
    
    inline def `skein1024-936`: typings.multicodec.multicodecStrings.`skein1024-936` = "skein1024-936".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-936`]
    
    inline def `skein1024-944`: typings.multicodec.multicodecStrings.`skein1024-944` = "skein1024-944".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-944`]
    
    inline def `skein1024-952`: typings.multicodec.multicodecStrings.`skein1024-952` = "skein1024-952".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-952`]
    
    inline def `skein1024-96`: typings.multicodec.multicodecStrings.`skein1024-96` = "skein1024-96".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-96`]
    
    inline def `skein1024-960`: typings.multicodec.multicodecStrings.`skein1024-960` = "skein1024-960".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-960`]
    
    inline def `skein1024-968`: typings.multicodec.multicodecStrings.`skein1024-968` = "skein1024-968".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-968`]
    
    inline def `skein1024-976`: typings.multicodec.multicodecStrings.`skein1024-976` = "skein1024-976".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-976`]
    
    inline def `skein1024-984`: typings.multicodec.multicodecStrings.`skein1024-984` = "skein1024-984".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-984`]
    
    inline def `skein1024-992`: typings.multicodec.multicodecStrings.`skein1024-992` = "skein1024-992".asInstanceOf[typings.multicodec.multicodecStrings.`skein1024-992`]
    
    inline def `skein256-104`: typings.multicodec.multicodecStrings.`skein256-104` = "skein256-104".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-104`]
    
    inline def `skein256-112`: typings.multicodec.multicodecStrings.`skein256-112` = "skein256-112".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-112`]
    
    inline def `skein256-120`: typings.multicodec.multicodecStrings.`skein256-120` = "skein256-120".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-120`]
    
    inline def `skein256-128`: typings.multicodec.multicodecStrings.`skein256-128` = "skein256-128".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-128`]
    
    inline def `skein256-136`: typings.multicodec.multicodecStrings.`skein256-136` = "skein256-136".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-136`]
    
    inline def `skein256-144`: typings.multicodec.multicodecStrings.`skein256-144` = "skein256-144".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-144`]
    
    inline def `skein256-152`: typings.multicodec.multicodecStrings.`skein256-152` = "skein256-152".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-152`]
    
    inline def `skein256-16`: typings.multicodec.multicodecStrings.`skein256-16` = "skein256-16".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-16`]
    
    inline def `skein256-160`: typings.multicodec.multicodecStrings.`skein256-160` = "skein256-160".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-160`]
    
    inline def `skein256-168`: typings.multicodec.multicodecStrings.`skein256-168` = "skein256-168".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-168`]
    
    inline def `skein256-176`: typings.multicodec.multicodecStrings.`skein256-176` = "skein256-176".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-176`]
    
    inline def `skein256-184`: typings.multicodec.multicodecStrings.`skein256-184` = "skein256-184".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-184`]
    
    inline def `skein256-192`: typings.multicodec.multicodecStrings.`skein256-192` = "skein256-192".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-192`]
    
    inline def `skein256-200`: typings.multicodec.multicodecStrings.`skein256-200` = "skein256-200".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-200`]
    
    inline def `skein256-208`: typings.multicodec.multicodecStrings.`skein256-208` = "skein256-208".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-208`]
    
    inline def `skein256-216`: typings.multicodec.multicodecStrings.`skein256-216` = "skein256-216".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-216`]
    
    inline def `skein256-224`: typings.multicodec.multicodecStrings.`skein256-224` = "skein256-224".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-224`]
    
    inline def `skein256-232`: typings.multicodec.multicodecStrings.`skein256-232` = "skein256-232".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-232`]
    
    inline def `skein256-24`: typings.multicodec.multicodecStrings.`skein256-24` = "skein256-24".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-24`]
    
    inline def `skein256-240`: typings.multicodec.multicodecStrings.`skein256-240` = "skein256-240".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-240`]
    
    inline def `skein256-248`: typings.multicodec.multicodecStrings.`skein256-248` = "skein256-248".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-248`]
    
    inline def `skein256-256`: typings.multicodec.multicodecStrings.`skein256-256` = "skein256-256".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-256`]
    
    inline def `skein256-32`: typings.multicodec.multicodecStrings.`skein256-32` = "skein256-32".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-32`]
    
    inline def `skein256-40`: typings.multicodec.multicodecStrings.`skein256-40` = "skein256-40".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-40`]
    
    inline def `skein256-48`: typings.multicodec.multicodecStrings.`skein256-48` = "skein256-48".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-48`]
    
    inline def `skein256-56`: typings.multicodec.multicodecStrings.`skein256-56` = "skein256-56".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-56`]
    
    inline def `skein256-64`: typings.multicodec.multicodecStrings.`skein256-64` = "skein256-64".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-64`]
    
    inline def `skein256-72`: typings.multicodec.multicodecStrings.`skein256-72` = "skein256-72".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-72`]
    
    inline def `skein256-8`: typings.multicodec.multicodecStrings.`skein256-8` = "skein256-8".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-8`]
    
    inline def `skein256-80`: typings.multicodec.multicodecStrings.`skein256-80` = "skein256-80".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-80`]
    
    inline def `skein256-88`: typings.multicodec.multicodecStrings.`skein256-88` = "skein256-88".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-88`]
    
    inline def `skein256-96`: typings.multicodec.multicodecStrings.`skein256-96` = "skein256-96".asInstanceOf[typings.multicodec.multicodecStrings.`skein256-96`]
    
    inline def `skein512-104`: typings.multicodec.multicodecStrings.`skein512-104` = "skein512-104".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-104`]
    
    inline def `skein512-112`: typings.multicodec.multicodecStrings.`skein512-112` = "skein512-112".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-112`]
    
    inline def `skein512-120`: typings.multicodec.multicodecStrings.`skein512-120` = "skein512-120".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-120`]
    
    inline def `skein512-128`: typings.multicodec.multicodecStrings.`skein512-128` = "skein512-128".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-128`]
    
    inline def `skein512-136`: typings.multicodec.multicodecStrings.`skein512-136` = "skein512-136".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-136`]
    
    inline def `skein512-144`: typings.multicodec.multicodecStrings.`skein512-144` = "skein512-144".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-144`]
    
    inline def `skein512-152`: typings.multicodec.multicodecStrings.`skein512-152` = "skein512-152".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-152`]
    
    inline def `skein512-16`: typings.multicodec.multicodecStrings.`skein512-16` = "skein512-16".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-16`]
    
    inline def `skein512-160`: typings.multicodec.multicodecStrings.`skein512-160` = "skein512-160".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-160`]
    
    inline def `skein512-168`: typings.multicodec.multicodecStrings.`skein512-168` = "skein512-168".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-168`]
    
    inline def `skein512-176`: typings.multicodec.multicodecStrings.`skein512-176` = "skein512-176".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-176`]
    
    inline def `skein512-184`: typings.multicodec.multicodecStrings.`skein512-184` = "skein512-184".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-184`]
    
    inline def `skein512-192`: typings.multicodec.multicodecStrings.`skein512-192` = "skein512-192".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-192`]
    
    inline def `skein512-200`: typings.multicodec.multicodecStrings.`skein512-200` = "skein512-200".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-200`]
    
    inline def `skein512-208`: typings.multicodec.multicodecStrings.`skein512-208` = "skein512-208".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-208`]
    
    inline def `skein512-216`: typings.multicodec.multicodecStrings.`skein512-216` = "skein512-216".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-216`]
    
    inline def `skein512-224`: typings.multicodec.multicodecStrings.`skein512-224` = "skein512-224".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-224`]
    
    inline def `skein512-232`: typings.multicodec.multicodecStrings.`skein512-232` = "skein512-232".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-232`]
    
    inline def `skein512-24`: typings.multicodec.multicodecStrings.`skein512-24` = "skein512-24".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-24`]
    
    inline def `skein512-240`: typings.multicodec.multicodecStrings.`skein512-240` = "skein512-240".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-240`]
    
    inline def `skein512-248`: typings.multicodec.multicodecStrings.`skein512-248` = "skein512-248".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-248`]
    
    inline def `skein512-256`: typings.multicodec.multicodecStrings.`skein512-256` = "skein512-256".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-256`]
    
    inline def `skein512-264`: typings.multicodec.multicodecStrings.`skein512-264` = "skein512-264".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-264`]
    
    inline def `skein512-272`: typings.multicodec.multicodecStrings.`skein512-272` = "skein512-272".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-272`]
    
    inline def `skein512-280`: typings.multicodec.multicodecStrings.`skein512-280` = "skein512-280".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-280`]
    
    inline def `skein512-288`: typings.multicodec.multicodecStrings.`skein512-288` = "skein512-288".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-288`]
    
    inline def `skein512-296`: typings.multicodec.multicodecStrings.`skein512-296` = "skein512-296".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-296`]
    
    inline def `skein512-304`: typings.multicodec.multicodecStrings.`skein512-304` = "skein512-304".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-304`]
    
    inline def `skein512-312`: typings.multicodec.multicodecStrings.`skein512-312` = "skein512-312".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-312`]
    
    inline def `skein512-32`: typings.multicodec.multicodecStrings.`skein512-32` = "skein512-32".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-32`]
    
    inline def `skein512-320`: typings.multicodec.multicodecStrings.`skein512-320` = "skein512-320".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-320`]
    
    inline def `skein512-328`: typings.multicodec.multicodecStrings.`skein512-328` = "skein512-328".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-328`]
    
    inline def `skein512-336`: typings.multicodec.multicodecStrings.`skein512-336` = "skein512-336".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-336`]
    
    inline def `skein512-344`: typings.multicodec.multicodecStrings.`skein512-344` = "skein512-344".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-344`]
    
    inline def `skein512-352`: typings.multicodec.multicodecStrings.`skein512-352` = "skein512-352".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-352`]
    
    inline def `skein512-360`: typings.multicodec.multicodecStrings.`skein512-360` = "skein512-360".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-360`]
    
    inline def `skein512-368`: typings.multicodec.multicodecStrings.`skein512-368` = "skein512-368".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-368`]
    
    inline def `skein512-376`: typings.multicodec.multicodecStrings.`skein512-376` = "skein512-376".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-376`]
    
    inline def `skein512-384`: typings.multicodec.multicodecStrings.`skein512-384` = "skein512-384".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-384`]
    
    inline def `skein512-392`: typings.multicodec.multicodecStrings.`skein512-392` = "skein512-392".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-392`]
    
    inline def `skein512-40`: typings.multicodec.multicodecStrings.`skein512-40` = "skein512-40".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-40`]
    
    inline def `skein512-400`: typings.multicodec.multicodecStrings.`skein512-400` = "skein512-400".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-400`]
    
    inline def `skein512-408`: typings.multicodec.multicodecStrings.`skein512-408` = "skein512-408".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-408`]
    
    inline def `skein512-416`: typings.multicodec.multicodecStrings.`skein512-416` = "skein512-416".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-416`]
    
    inline def `skein512-424`: typings.multicodec.multicodecStrings.`skein512-424` = "skein512-424".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-424`]
    
    inline def `skein512-432`: typings.multicodec.multicodecStrings.`skein512-432` = "skein512-432".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-432`]
    
    inline def `skein512-440`: typings.multicodec.multicodecStrings.`skein512-440` = "skein512-440".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-440`]
    
    inline def `skein512-448`: typings.multicodec.multicodecStrings.`skein512-448` = "skein512-448".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-448`]
    
    inline def `skein512-456`: typings.multicodec.multicodecStrings.`skein512-456` = "skein512-456".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-456`]
    
    inline def `skein512-464`: typings.multicodec.multicodecStrings.`skein512-464` = "skein512-464".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-464`]
    
    inline def `skein512-472`: typings.multicodec.multicodecStrings.`skein512-472` = "skein512-472".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-472`]
    
    inline def `skein512-48`: typings.multicodec.multicodecStrings.`skein512-48` = "skein512-48".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-48`]
    
    inline def `skein512-480`: typings.multicodec.multicodecStrings.`skein512-480` = "skein512-480".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-480`]
    
    inline def `skein512-488`: typings.multicodec.multicodecStrings.`skein512-488` = "skein512-488".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-488`]
    
    inline def `skein512-496`: typings.multicodec.multicodecStrings.`skein512-496` = "skein512-496".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-496`]
    
    inline def `skein512-504`: typings.multicodec.multicodecStrings.`skein512-504` = "skein512-504".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-504`]
    
    inline def `skein512-512`: typings.multicodec.multicodecStrings.`skein512-512` = "skein512-512".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-512`]
    
    inline def `skein512-56`: typings.multicodec.multicodecStrings.`skein512-56` = "skein512-56".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-56`]
    
    inline def `skein512-64`: typings.multicodec.multicodecStrings.`skein512-64` = "skein512-64".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-64`]
    
    inline def `skein512-72`: typings.multicodec.multicodecStrings.`skein512-72` = "skein512-72".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-72`]
    
    inline def `skein512-8`: typings.multicodec.multicodecStrings.`skein512-8` = "skein512-8".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-8`]
    
    inline def `skein512-80`: typings.multicodec.multicodecStrings.`skein512-80` = "skein512-80".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-80`]
    
    inline def `skein512-88`: typings.multicodec.multicodecStrings.`skein512-88` = "skein512-88".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-88`]
    
    inline def `skein512-96`: typings.multicodec.multicodecStrings.`skein512-96` = "skein512-96".asInstanceOf[typings.multicodec.multicodecStrings.`skein512-96`]
    
    inline def `skynet-ns`: typings.multicodec.multicodecStrings.`skynet-ns` = "skynet-ns".asInstanceOf[typings.multicodec.multicodecStrings.`skynet-ns`]
    
    inline def `sm3-256`: typings.multicodec.multicodecStrings.`sm3-256` = "sm3-256".asInstanceOf[typings.multicodec.multicodecStrings.`sm3-256`]
    
    inline def `stellar-block`: typings.multicodec.multicodecStrings.`stellar-block` = "stellar-block".asInstanceOf[typings.multicodec.multicodecStrings.`stellar-block`]
    
    inline def `stellar-tx`: typings.multicodec.multicodecStrings.`stellar-tx` = "stellar-tx".asInstanceOf[typings.multicodec.multicodecStrings.`stellar-tx`]
    
    inline def streamid: streamid_ = "streamid".asInstanceOf[streamid_]
    
    inline def `swarm-feed`: typings.multicodec.multicodecStrings.`swarm-feed` = "swarm-feed".asInstanceOf[typings.multicodec.multicodecStrings.`swarm-feed`]
    
    inline def `swarm-manifest`: typings.multicodec.multicodecStrings.`swarm-manifest` = "swarm-manifest".asInstanceOf[typings.multicodec.multicodecStrings.`swarm-manifest`]
    
    inline def `swarm-ns`: typings.multicodec.multicodecStrings.`swarm-ns` = "swarm-ns".asInstanceOf[typings.multicodec.multicodecStrings.`swarm-ns`]
    
    inline def `swhid-1-snp`: typings.multicodec.multicodecStrings.`swhid-1-snp` = "swhid-1-snp".asInstanceOf[typings.multicodec.multicodecStrings.`swhid-1-snp`]
    
    inline def tcp: tcp_ = "tcp".asInstanceOf[tcp_]
    
    inline def thread: thread_ = "thread".asInstanceOf[thread_]
    
    inline def tls: tls_ = "tls".asInstanceOf[tls_]
    
    inline def `torrent-file`: typings.multicodec.multicodecStrings.`torrent-file` = "torrent-file".asInstanceOf[typings.multicodec.multicodecStrings.`torrent-file`]
    
    inline def `torrent-info`: typings.multicodec.multicodecStrings.`torrent-info` = "torrent-info".asInstanceOf[typings.multicodec.multicodecStrings.`torrent-info`]
    
    inline def udp: udp_ = "udp".asInstanceOf[udp_]
    
    inline def udt: udt_ = "udt".asInstanceOf[udt_]
    
    inline def unix: unix_ = "unix".asInstanceOf[unix_]
    
    inline def utp: utp_ = "utp".asInstanceOf[utp_]
    
    inline def ws: ws_ = "ws".asInstanceOf[ws_]
    
    inline def wss: wss_ = "wss".asInstanceOf[wss_]
    
    inline def x11: x11_ = "x11".asInstanceOf[x11_]
    
    inline def `x25519-priv`: typings.multicodec.multicodecStrings.`x25519-priv` = "x25519-priv".asInstanceOf[typings.multicodec.multicodecStrings.`x25519-priv`]
    
    inline def `x25519-pub`: typings.multicodec.multicodecStrings.`x25519-pub` = "x25519-pub".asInstanceOf[typings.multicodec.multicodecStrings.`x25519-pub`]
    
    inline def `x448-pub`: typings.multicodec.multicodecStrings.`x448-pub` = "x448-pub".asInstanceOf[typings.multicodec.multicodecStrings.`x448-pub`]
    
    inline def `zcash-block`: typings.multicodec.multicodecStrings.`zcash-block` = "zcash-block".asInstanceOf[typings.multicodec.multicodecStrings.`zcash-block`]
    
    inline def `zcash-tx`: typings.multicodec.multicodecStrings.`zcash-tx` = "zcash-tx".asInstanceOf[typings.multicodec.multicodecStrings.`zcash-tx`]
    
    inline def zeronet: zeronet_ = "zeronet".asInstanceOf[zeronet_]
    
    inline def `zeroxcert-imprint-256`: typings.multicodec.multicodecStrings.`zeroxcert-imprint-256` = "zeroxcert-imprint-256".asInstanceOf[typings.multicodec.multicodecStrings.`zeroxcert-imprint-256`]
  }
}
