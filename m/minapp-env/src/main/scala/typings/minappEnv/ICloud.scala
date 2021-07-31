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
    
    @scala.inline
    def apply(name: java.lang.String): CallFunctionParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallFunctionParam]
    }
    
    @scala.inline
    implicit class CallFunctionParamMutableBuilder[Self <: CallFunctionParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: CallFunctionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlow(value: scala.Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowUndefined: Self = StObject.set(x, "slow", js.undefined)
    }
  }
  
  trait CallFunctionResult
    extends StObject
       with IAPISuccessParam {
    
    var result: js.UndefOr[AnyObject | java.lang.String] = js.undefined
  }
  object CallFunctionResult {
    
    @scala.inline
    def apply(errMsg: java.lang.String): CallFunctionResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallFunctionResult]
    }
    
    @scala.inline
    implicit class CallFunctionResultMutableBuilder[Self <: CallFunctionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: AnyObject | java.lang.String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait DeleteFileParam
    extends StObject
       with ICloudAPIParam[DeleteFileResult] {
    
    var fileList: Array[java.lang.String]
  }
  object DeleteFileParam {
    
    @scala.inline
    def apply(fileList: Array[java.lang.String]): DeleteFileParam = {
      val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileParam]
    }
    
    @scala.inline
    implicit class DeleteFileParamMutableBuilder[Self <: DeleteFileParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileList(value: Array[java.lang.String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(errMsg: java.lang.String, fileList: Array[DeleteFileResultItem]): DeleteFileResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileResult]
    }
    
    @scala.inline
    implicit class DeleteFileResultMutableBuilder[Self <: DeleteFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileList(value: Array[DeleteFileResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteFileResultItem extends StObject {
    
    var errMsg: java.lang.String
    
    var fileID: java.lang.String
    
    var status: Double
  }
  object DeleteFileResultItem {
    
    @scala.inline
    def apply(errMsg: java.lang.String, fileID: java.lang.String, status: Double): DeleteFileResultItem = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileResultItem]
    }
    
    @scala.inline
    implicit class DeleteFileResultItemMutableBuilder[Self <: DeleteFileResultItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadFileParam
    extends StObject
       with ICloudAPIParam[DownloadFileResult] {
    
    var cloudPath: js.UndefOr[java.lang.String] = js.undefined
    
    var fileID: java.lang.String
  }
  object DownloadFileParam {
    
    @scala.inline
    def apply(fileID: java.lang.String): DownloadFileParam = {
      val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadFileParam]
    }
    
    @scala.inline
    implicit class DownloadFileParamMutableBuilder[Self <: DownloadFileParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudPath(value: java.lang.String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudPathUndefined: Self = StObject.set(x, "cloudPath", js.undefined)
      
      @scala.inline
      def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadFileResult
    extends StObject
       with IAPISuccessParam {
    
    var statusCode: Double
    
    var tempFilePath: java.lang.String
  }
  object DownloadFileResult {
    
    @scala.inline
    def apply(errMsg: java.lang.String, statusCode: Double, tempFilePath: java.lang.String): DownloadFileResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadFileResult]
    }
    
    @scala.inline
    implicit class DownloadFileResultMutableBuilder[Self <: DownloadFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempFilePath(value: java.lang.String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTempFileURLParam
    extends StObject
       with ICloudAPIParam[GetTempFileURLResult] {
    
    var fileList: Array[java.lang.String]
  }
  object GetTempFileURLParam {
    
    @scala.inline
    def apply(fileList: Array[java.lang.String]): GetTempFileURLParam = {
      val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTempFileURLParam]
    }
    
    @scala.inline
    implicit class GetTempFileURLParamMutableBuilder[Self <: GetTempFileURLParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileList(value: Array[java.lang.String]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTempFileURLResult
    extends StObject
       with IAPISuccessParam {
    
    var fileList: Array[GetTempFileURLResultItem]
  }
  object GetTempFileURLResult {
    
    @scala.inline
    def apply(errMsg: java.lang.String, fileList: Array[GetTempFileURLResultItem]): GetTempFileURLResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTempFileURLResult]
    }
    
    @scala.inline
    implicit class GetTempFileURLResultMutableBuilder[Self <: GetTempFileURLResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileList(value: Array[GetTempFileURLResultItem]): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      errMsg: java.lang.String,
      fileID: java.lang.String,
      maxAge: Double,
      status: Double,
      tempFileURL: java.lang.String
    ): GetTempFileURLResultItem = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tempFileURL = tempFileURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTempFileURLResultItem]
    }
    
    @scala.inline
    implicit class GetTempFileURLResultItemMutableBuilder[Self <: GetTempFileURLResultItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempFileURL(value: java.lang.String): Self = StObject.set(x, "tempFileURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICloudAPIParam[T]
    extends StObject
       with IAPIParam[T]
  object ICloudAPIParam {
    
    @scala.inline
    def apply[T](): ICloudAPIParam[T] = {
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
    
    @scala.inline
    def apply(cloudPath: java.lang.String, filePath: java.lang.String): UploadFileParam = {
      val __obj = js.Dynamic.literal(cloudPath = cloudPath.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFileParam]
    }
    
    @scala.inline
    implicit class UploadFileParamMutableBuilder[Self <: UploadFileParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudPath(value: java.lang.String): Self = StObject.set(x, "cloudPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: java.lang.String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  trait UploadFileResult
    extends StObject
       with IAPISuccessParam {
    
    var fileID: java.lang.String
    
    var statusCode: Double
  }
  object UploadFileResult {
    
    @scala.inline
    def apply(errMsg: java.lang.String, fileID: java.lang.String, statusCode: Double): UploadFileResult = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], fileID = fileID.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadFileResult]
    }
    
    @scala.inline
    implicit class UploadFileResultMutableBuilder[Self <: UploadFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileID(value: java.lang.String): Self = StObject.set(x, "fileID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
