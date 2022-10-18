package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the TimeStampReq structure described in [RFC3161](https://www.ietf.org/rfc/rfc3161.txt)
  *
  * @example The following example demonstrates how to create Time-Stamp Request
  * ```js
  * const nonce = pkijs.getRandomValues(new Uint8Array(10)).buffer;
  *
  * const tspReq = new pkijs.TimeStampReq({
  *   version: 1,
  *   messageImprint: await pkijs.MessageImprint.create("SHA-256", message),
  *   reqPolicy: "1.2.3.4.5.6",
  *   certReq: true,
  *   nonce: new asn1js.Integer({ valueHex: nonce }),
  * });
  *
  * const tspReqRaw = tspReq.toSchema().toBER();
  */
@js.native
trait TimeStampReq
  extends StObject
     with PkiObject
     with ITimeStampReq
