package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ICloud {
  
  type CallFunctionData = AnyObject
  
  trait CallFunctionParam
    extends StObject
       with ICloudAPIParam[CallFunctionResult] {
    
    var data: js.UndefOr[CallFunctionData] = js.undefined
    
    var name: java.lang.String
    
    var slow: js.UndefOr[scala.Boolean] = js.undefined
  }
  object CallFunctionParam {
    
    inline def apply(name: java.lang.String): CallFunctionParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallFunctionParam]
    }
    
    extension [Self <: CallFunctionParam](x: Self) {
      
      inline def setData(value: CallFunctionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSlow(value: scala.Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
    }
  }
  
  trait CallFunctionResult
    extends StObject
       with IAPISuccessParam {
    
    var result: js.UndefOr[AnyObject | java.lang.String] = js.undefined
  }
  object CallFunctionResult {
    
    inline def apply(errMsg: java.lang.String): CallFunctionResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallFunctionResult]
    }
    
    extension [Self <: CallFunctionResult](x: Self) {
      
      inline def setResult(value: AnyObject | java.lang.String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait DeleteFileParam
    extends StObject
       with ICloudAPIParam[DeleteFileResult] {
    
    var fileList: Array[java.lang.String]
  }
  object DeleteFileParam {
    
    inline def apply(fileList: Array[java.lang.String]): DeleteFileParam = {
      val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileParam]
    }
    
    extension [Self <: DeleteFileParam](x: Self) {
      
      inline def setFileList(value: Array[java.lang.String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    }
  }
  
  // === end ===
  // === API: deleteFile ===
  trait DeleteFileResult
    extends StObject
       with IAPISuccessParam {
    
    var fileList: Array[DeleteFileResultItem]
  }
  object DeleteFileResult {
    
    inline def apply(errMsg: java.lang.String, fileList: Array[DeleteFileResultItem]): DeleteFileResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileResult]
    }
    
    extension [Self <: DeleteFileResult](x: Self) {
      
      inline def setFileList(value: Array[DeleteFileResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteFileResultItem extends StObject {
    
    var errMsg: java.lang.String
    
    var fileID: java.lang.String
    
    var status: Double
  }
  object DeleteFileResultItem {
    
    inline def apply(errMsg: java.lang.String, fileID: java.lang.String, status: Double): DeleteFileResultItem = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileResultItem]
    }
    
    extension [Self <: DeleteFileResultItem](x: Self) {
      
      inline def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
      
      inline def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadFileParam
    extends StObject
       with ICloudAPIParam[DownloadFileResult] {
    
    var cloudPath: js.UndefOr[java.lang.String] = js.undefined
    
    var fileID: java.lang.String
  }
  object DownloadFileParam {
    
    inline def apply(fileID: java.lang.String): DownloadFileParam = {
      val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadFileParam]
    }
    
    extension [Self <: DownloadFileParam](x: Self) {
      
      inline def setCloudPath(value: java.lang.String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
      
      inline def setCloudPathUndefined: Self = StObject.set(x, "cloudPath", js.undefined)
      
      inline def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadFileResult
    extends StObject
       with IAPISuccessParam {
    
    var statusCode: Double
    
    var tempFilePath: java.lang.String
  }
  object DownloadFileResult {
    
    inline def apply(errMsg: java.lang.String, statusCode: Double, tempFilePath: java.lang.String): DownloadFileResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadFileResult]
    }
    
    extension [Self <: DownloadFileResult](x: Self) {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setTempFilePath(value: java.lang.String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTempFileURLParam
    extends StObject
       with ICloudAPIParam[GetTempFileURLResult] {
    
    var fileList: Array[java.lang.String]
  }
  object GetTempFileURLParam {
    
    inline def apply(fileList: Array[java.lang.String]): GetTempFileURLParam = {
      val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTempFileURLParam]
    }
    
    extension [Self <: GetTempFileURLParam](x: Self) {
      
      inline def setFileList(value: Array[java.lang.String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTempFileURLResult
    extends StObject
       with IAPISuccessParam {
    
    var fileList: Array[GetTempFileURLResultItem]
  }
  object GetTempFileURLResult {
    
    inline def apply(errMsg: java.lang.String, fileList: Array[GetTempFileURLResultItem]): GetTempFileURLResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTempFileURLResult]
    }
    
    extension [Self <: GetTempFileURLResult](x: Self) {
      
      inline def setFileList(value: Array[GetTempFileURLResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTempFileURLResultItem extends StObject {
    
    var errMsg: java.lang.String
    
    var fileID: java.lang.String
    
    var maxAge: Double
    
    var status: Double
    
    var tempFileURL: java.lang.String
  }
  object GetTempFileURLResultItem {
    
    inline def apply(
      errMsg: java.lang.String,
      fileID: java.lang.String,
      maxAge: Double,
      status: Double,
      tempFileURL: java.lang.String
    ): GetTempFileURLResultItem = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTempFileURLResultItem]
    }
    
    extension [Self <: GetTempFileURLResultItem](x: Self) {
      
      inline def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
      
      inline def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTempFileURL(value: java.lang.String): Self = StObject.set(x, "tempFileURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICloudAPIParam[T]
    extends StObject
       with IAPIParam[T]
  object ICloudAPIParam {
    
    inline def apply[T](): ICloudAPIParam[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICloudAPIParam[T]]
    }
  }
  
  trait UploadFileParam
    extends StObject
       with ICloudAPIParam[UploadFileResult] {
    
    var cloudPath: java.lang.String
    
    var filePath: java.lang.String
    
    var header: js.UndefOr[AnyObject] = js.undefined
  }
  object UploadFileParam {
    
    inline def apply(cloudPath: java.lang.String, filePath: java.lang.String): UploadFileParam = {
      val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFileParam]
    }
    
    extension [Self <: UploadFileParam](x: Self) {
      
      inline def setCloudPath(value: java.lang.String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: java.lang.String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  trait UploadFileResult
    extends StObject
       with IAPISuccessParam {
    
    var fileID: java.lang.String
    
    var statusCode: Double
  }
  object UploadFileResult {
    
    inline def apply(errMsg: java.lang.String, fileID: java.lang.String, statusCode: Double): UploadFileResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFileResult]
    }
    
    extension [Self <: UploadFileResult](x: Self) {
      
      inline def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
