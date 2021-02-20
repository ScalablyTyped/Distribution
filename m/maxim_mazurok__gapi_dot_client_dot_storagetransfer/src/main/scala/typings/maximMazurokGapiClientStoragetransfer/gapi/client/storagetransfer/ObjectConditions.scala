package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConditions extends StObject {
  
  /** `exclude_prefixes` must follow the requirements described for include_prefixes. The max size of `exclude_prefixes` is 1000. */
  var excludePrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If `include_prefixes` is specified, objects that satisfy the object conditions must have names that start with one of the `include_prefixes` and that do not start with any of the
    * exclude_prefixes. If `include_prefixes` is not specified, all objects except those that have names starting with one of the `exclude_prefixes` must satisfy the object conditions.
    * Requirements: * Each include-prefix and exclude-prefix can contain any sequence of Unicode characters, to a max length of 1024 bytes when UTF8-encoded, and must not contain Carriage
    * Return or Line Feed characters. Wildcard matching and regular expression matching are not supported. * Each include-prefix and exclude-prefix must omit the leading slash. For
    * example, to include the `requests.gz` object in a transfer from `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include prefix as `logs/y=2015/requests.gz`. * None of the
    * include-prefix or the exclude-prefix values can be empty, if specified. * Each include-prefix must include a distinct portion of the object namespace. No include-prefix may be a
    * prefix of another include-prefix. * Each exclude-prefix must exclude a distinct portion of the object namespace. No exclude-prefix may be a prefix of another exclude-prefix. * If
    * `include_prefixes` is specified, then each exclude-prefix must start with the value of a path explicitly included by `include_prefixes`. The max size of `include_prefixes` is 1000.
    */
  var includePrefixes: js.UndefOr[js.Array[String]] = js.native
  
  /** If specified, only objects with a "last modification time" before this timestamp and objects that don't have a "last modification time" will be transferred. */
  var lastModifiedBefore: js.UndefOr[String] = js.native
  
  /**
    * If specified, only objects with a "last modification time" on or after this timestamp and objects that don't have a "last modification time" are transferred. The
    * `last_modified_since` and `last_modified_before` fields can be used together for chunked data processing. For example, consider a script that processes each day's worth of data at a
    * time. For that you'd set each of the fields as follows: * `last_modified_since` to the start of the day * `last_modified_before` to the end of the day
    */
  var lastModifiedSince: js.UndefOr[String] = js.native
  
  /**
    * If specified, only objects with a "last modification time" on or after `NOW` - `max_time_elapsed_since_last_modification` and objects that don't have a "last modification time" are
    * transferred. For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the `TransferOperation`.
    */
  var maxTimeElapsedSinceLastModification: js.UndefOr[String] = js.native
  
  /**
    * If specified, only objects with a "last modification time" before `NOW` - `min_time_elapsed_since_last_modification` and objects that don't have a "last modification time" are
    * transferred. For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the `TransferOperation`.
    */
  var minTimeElapsedSinceLastModification: js.UndefOr[String] = js.native
}
object ObjectConditions {
  
  @scala.inline
  def apply(): ObjectConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectConditions]
  }
  
  @scala.inline
  implicit class ObjectConditionsMutableBuilder[Self <: ObjectConditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludePrefixes(value: js.Array[String]): Self = StObject.set(x, "excludePrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludePrefixesUndefined: Self = StObject.set(x, "excludePrefixes", js.undefined)
    
    @scala.inline
    def setExcludePrefixesVarargs(value: String*): Self = StObject.set(x, "excludePrefixes", js.Array(value :_*))
    
    @scala.inline
    def setIncludePrefixes(value: js.Array[String]): Self = StObject.set(x, "includePrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePrefixesUndefined: Self = StObject.set(x, "includePrefixes", js.undefined)
    
    @scala.inline
    def setIncludePrefixesVarargs(value: String*): Self = StObject.set(x, "includePrefixes", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedBefore(value: String): Self = StObject.set(x, "lastModifiedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBeforeUndefined: Self = StObject.set(x, "lastModifiedBefore", js.undefined)
    
    @scala.inline
    def setLastModifiedSince(value: String): Self = StObject.set(x, "lastModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedSinceUndefined: Self = StObject.set(x, "lastModifiedSince", js.undefined)
    
    @scala.inline
    def setMaxTimeElapsedSinceLastModification(value: String): Self = StObject.set(x, "maxTimeElapsedSinceLastModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeElapsedSinceLastModificationUndefined: Self = StObject.set(x, "maxTimeElapsedSinceLastModification", js.undefined)
    
    @scala.inline
    def setMinTimeElapsedSinceLastModification(value: String): Self = StObject.set(x, "minTimeElapsedSinceLastModification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTimeElapsedSinceLastModificationUndefined: Self = StObject.set(x, "minTimeElapsedSinceLastModification", js.undefined)
  }
}
