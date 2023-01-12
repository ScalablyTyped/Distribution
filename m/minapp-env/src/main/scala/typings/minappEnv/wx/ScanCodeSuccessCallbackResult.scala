package typings.minappEnv.wx

import typings.minappEnv.minappEnvStrings.AZTEC
import typings.minappEnv.minappEnvStrings.CODABAR
import typings.minappEnv.minappEnvStrings.CODE_128
import typings.minappEnv.minappEnvStrings.CODE_25
import typings.minappEnv.minappEnvStrings.CODE_39
import typings.minappEnv.minappEnvStrings.CODE_93
import typings.minappEnv.minappEnvStrings.DATA_MATRIX
import typings.minappEnv.minappEnvStrings.EAN_13
import typings.minappEnv.minappEnvStrings.EAN_8
import typings.minappEnv.minappEnvStrings.ITF
import typings.minappEnv.minappEnvStrings.MAXICODE
import typings.minappEnv.minappEnvStrings.PDF_417
import typings.minappEnv.minappEnvStrings.QR_CODE
import typings.minappEnv.minappEnvStrings.RSS_14
import typings.minappEnv.minappEnvStrings.RSS_EXPANDED
import typings.minappEnv.minappEnvStrings.UPC_A
import typings.minappEnv.minappEnvStrings.UPC_E
import typings.minappEnv.minappEnvStrings.UPC_EAN_EXTENSION
import typings.minappEnv.minappEnvStrings.WX_CODE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeSuccessCallbackResult extends StObject {
  
  /** 所扫码的字符集 */
  var charSet: String
  
  /** 当所扫的码为当前小程序的合法二维码时，会返回此字段，内容为二维码携带的 path */
  var path: String
  
  /** 原始数据，base64编码 */
  var rawData: String
  
  /** 所扫码的内容 */
  var result: String
  
  /** 所扫码的类型
    *
    * 可选值：
    * - 'QR_CODE': 二维码;
    * - 'AZTEC': 一维码;
    * - 'CODABAR': 一维码;
    * - 'CODE_39': 一维码;
    * - 'CODE_93': 一维码;
    * - 'CODE_128': 一维码;
    * - 'DATA_MATRIX': 二维码;
    * - 'EAN_8': 一维码;
    * - 'EAN_13': 一维码;
    * - 'ITF': 一维码;
    * - 'MAXICODE': 一维码;
    * - 'PDF_417': 二维码;
    * - 'RSS_14': 一维码;
    * - 'RSS_EXPANDED': 一维码;
    * - 'UPC_A': 一维码;
    * - 'UPC_E': 一维码;
    * - 'UPC_EAN_EXTENSION': 一维码;
    * - 'WX_CODE': 二维码;
    * - 'CODE_25': 一维码; */
  var scanType: QR_CODE | AZTEC | CODABAR | CODE_39 | CODE_93 | CODE_128 | DATA_MATRIX | EAN_8 | EAN_13 | ITF | MAXICODE | PDF_417 | RSS_14 | RSS_EXPANDED | UPC_A | UPC_E | UPC_EAN_EXTENSION | WX_CODE | CODE_25
}
object ScanCodeSuccessCallbackResult {
  
  inline def apply(
    charSet: String,
    path: String,
    rawData: String,
    result: String,
    scanType: QR_CODE | AZTEC | CODABAR | CODE_39 | CODE_93 | CODE_128 | DATA_MATRIX | EAN_8 | EAN_13 | ITF | MAXICODE | PDF_417 | RSS_14 | RSS_EXPANDED | UPC_A | UPC_E | UPC_EAN_EXTENSION | WX_CODE | CODE_25
  ): ScanCodeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanCodeSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setScanType(
      value: QR_CODE | AZTEC | CODABAR | CODE_39 | CODE_93 | CODE_128 | DATA_MATRIX | EAN_8 | EAN_13 | ITF | MAXICODE | PDF_417 | RSS_14 | RSS_EXPANDED | UPC_A | UPC_E | UPC_EAN_EXTENSION | WX_CODE | CODE_25
    ): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
  }
}
