package typings.nodemailer

import typings.node.Buffer
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.nodemailer.anon.Key
import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dkimMod {
  
  @JSImport("nodemailer/lib/dkim", JSImport.Namespace)
  @js.native
  class ^ () extends DKIM {
    def this(options: Options) = this()
  }
  
  @js.native
  trait DKIM extends StObject {
    
    var keys: js.Array[SingleKeyOptions] = js.native
    
    var options: Options = js.native
    
    def sign(input: String): PassThrough = js.native
    def sign(input: String, extraOptions: Options): PassThrough = js.native
    def sign(input: Buffer): PassThrough = js.native
    def sign(input: Buffer, extraOptions: Options): PassThrough = js.native
    def sign(input: Readable): PassThrough = js.native
    def sign(input: Readable, extraOptions: Options): PassThrough = js.native
  }
  
  @js.native
  trait MultipleKeysOptions
    extends OptionalOptions
       with Options {
    
    /** is an optional array of key objects (domainName, keySelector, privateKey) if you want to add more than one signature to the message. If this value is set then the default key values are ignored */
    var keys: js.Array[SingleKeyOptions] = js.native
  }
  object MultipleKeysOptions {
    
    @scala.inline
    def apply(keys: js.Array[SingleKeyOptions]): MultipleKeysOptions = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleKeysOptions]
    }
    
    @scala.inline
    implicit class MultipleKeysOptionsMutableBuilder[Self <: MultipleKeysOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: js.Array[SingleKeyOptions]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysVarargs(value: SingleKeyOptions*): Self = StObject.set(x, "keys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OptionalOptions extends StObject {
    
    /** optional location for cached messages. If not set then caching is not used. */
    var cacheDir: js.UndefOr[String | `false`] = js.native
    
    /** optional size in bytes, if message is larger than this treshold it gets cached to disk (assuming cacheDir is set and writable). Defaults to 131072 (128 kB). */
    var cacheTreshold: js.UndefOr[Double] = js.native
    
    /** optional algorithm for the body hash, defaults to ‘sha256’ */
    var hashAlgo: js.UndefOr[String] = js.native
    
    /** an optional colon separated list of header keys to sign (eg. message-id:date:from:to...') */
    var headerFieldNames: js.UndefOr[String] = js.native
    
    /** optional colon separated list of header keys not to sign. This is useful if you want to sign all the relevant keys but your provider changes some values, ie Message-ID and Date. In this case you should use 'message-id:date' to prevent signing these values. */
    var skipFields: js.UndefOr[String] = js.native
  }
  object OptionalOptions {
    
    @scala.inline
    def apply(): OptionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalOptions]
    }
    
    @scala.inline
    implicit class OptionalOptionsMutableBuilder[Self <: OptionalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDir(value: String | `false`): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      @scala.inline
      def setCacheTreshold(value: Double): Self = StObject.set(x, "cacheTreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheTresholdUndefined: Self = StObject.set(x, "cacheTreshold", js.undefined)
      
      @scala.inline
      def setHashAlgo(value: String): Self = StObject.set(x, "hashAlgo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashAlgoUndefined: Self = StObject.set(x, "hashAlgo", js.undefined)
      
      @scala.inline
      def setHeaderFieldNames(value: String): Self = StObject.set(x, "headerFieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFieldNamesUndefined: Self = StObject.set(x, "headerFieldNames", js.undefined)
      
      @scala.inline
      def setSkipFields(value: String): Self = StObject.set(x, "skipFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFieldsUndefined: Self = StObject.set(x, "skipFields", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodemailer.dkimMod.SingleKeyOptions
    - typings.nodemailer.dkimMod.MultipleKeysOptions
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def MultipleKeysOptions(keys: js.Array[SingleKeyOptions]): typings.nodemailer.dkimMod.MultipleKeysOptions = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodemailer.dkimMod.MultipleKeysOptions]
    }
    
    @scala.inline
    def SingleKeyOptions(domainName: String, keySelector: String, privateKey: String | Key): typings.nodemailer.dkimMod.SingleKeyOptions = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodemailer.dkimMod.SingleKeyOptions]
    }
  }
  
  @js.native
  trait SingleKeyOptions
    extends OptionalOptions
       with Options {
    
    /** is the domain name to use in the signature */
    var domainName: String = js.native
    
    /** is the DKIM key selector */
    var keySelector: String = js.native
    
    /** is the private key for the selector in PEM format */
    var privateKey: String | Key = js.native
  }
  object SingleKeyOptions {
    
    @scala.inline
    def apply(domainName: String, keySelector: String, privateKey: String | Key): SingleKeyOptions = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleKeyOptions]
    }
    
    @scala.inline
    implicit class SingleKeyOptionsMutableBuilder[Self <: SingleKeyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySelector(value: String): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: String | Key): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
}
