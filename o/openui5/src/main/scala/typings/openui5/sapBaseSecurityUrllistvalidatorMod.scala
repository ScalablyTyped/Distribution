package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseSecurityUrllistvalidatorMod extends Shortcut {
  
  @JSImport("sap/base/security/URLListValidator", JSImport.Default)
  @js.native
  val default: URLListValidator = js.native
  
  trait Entry extends StObject {
    
    /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    var port: js.UndefOr[String] = js.undefined
    
    /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    var protocol: js.UndefOr[String] = js.undefined
  }
  object Entry {
    
    inline def apply(): Entry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  /**
    * @since 1.85
    *
    * Registry to manage allowed URLs and validate against them.
    */
  @js.native
  trait URLListValidator extends StObject {
    
    /**
      * Adds an allowed entry.
      *
      * Note: Adding the first entry to the list of allowed entries will disallow all URLs but the ones matching
      * the newly added entry.
      *
      * **Note**: It is strongly recommended to set a path only in combination with an origin (never set a path
      * alone). There's almost no case where checking only the path of a URL would allow to ensure its validity.
      */
    def add(): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: Unit,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: Unit,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: Unit,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: String,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: Unit,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: Unit,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: String,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: Unit,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: Unit,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: Unit,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: String,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    def add(
      /**
      * The protocol of the URL, can be falsy to allow all protocols for an entry e.g. "", "http", "mailto"
      */
    protocol: Unit,
      /**
      * The host of the URL, can be falsy to allow all hosts. A wildcard asterisk can be set at the beginning,
      * e.g. "examples.com", "*.example.com"
      */
    host: Unit,
      /**
      * The port of the URL, can be falsy to allow all ports, e.g. "", "8080"
      */
    port: Unit,
      /**
      * the path of the URL, path of the url, can be falsy to allow all paths. A wildcard asterisk can be set
      * at the end, e.g. "/my-example*", "/my-news"
      */
    path: String
    ): Unit = js.native
    
    /**
      * Clears the allowed entries for URL validation. This makes all URLs allowed.
      */
    def clear(): Unit = js.native
    
    /**
      * Gets the list of allowed entries.
      *
      * @returns The allowed entries
      */
    def entries(): js.Array[Entry] = js.native
    
    /**
      * Validates a URL. Check if it's not a script or other security issue.
      *
      * **Note**: It is strongly recommended to validate only absolute URLs. There's almost no case where checking
      * only the path of a URL would allow to ensure its validity. For compatibility reasons, this API cannot
      * automatically resolve URLs relative to `document.baseURI`, but callers should do so. In that case, and
      * when the allow list is not empty, an entry for the origin of `document.baseURI` must be added to the
      * allow list.
      *
      * Details: Splits the given URL into components and checks for allowed characters according to RFC 3986:
      *
      *
      * ```javascript
      *
      * authority     = [ userinfo "@" ] host [ ":" port ]
      * userinfo      = *( unreserved / pct-encoded / sub-delims / ":" )
      * host          = IP-literal / IPv4address / reg-name
      *
      * IP-literal    = "[" ( IPv6address / IPvFuture  ) "]"
      * IPvFuture     = "v" 1*HEXDIG "." 1*( unreserved / sub-delims / ":" )
      * IPv6address   =                            6( h16 ":" ) ls32
      *               /                       "::" 5( h16 ":" ) ls32
      *               / [               h16 ] "::" 4( h16 ":" ) ls32
      *               / [ *1( h16 ":" ) h16 ] "::" 3( h16 ":" ) ls32
      *               / [ *2( h16 ":" ) h16 ] "::" 2( h16 ":" ) ls32
      *               / [ *3( h16 ":" ) h16 ] "::"    h16 ":"   ls32
      *               / [ *4( h16 ":" ) h16 ] "::"              ls32
      *               / [ *5( h16 ":" ) h16 ] "::"              h16
      *               / [ *6( h16 ":" ) h16 ] "::"
      * ls32          = ( h16 ":" h16 ) / IPv4address
      *               ; least-significant 32 bits of address
      * h16           = 1*4HEXDIG
      *               ; 16 bits of address represented in hexadecimal
      *
      * IPv4address   = dec-octet "." dec-octet "." dec-octet "." dec-octet
      * dec-octet     = DIGIT                 ; 0-9
      *               / %x31-39 DIGIT         ; 10-99
      *               / "1" 2DIGIT            ; 100-199
      *               / "2" %x30-34 DIGIT     ; 200-249
      *               / "25" %x30-35          ; 250-255
      *
      * reg-name      = *( unreserved / pct-encoded / sub-delims )
      *
      * pct-encoded   = "%" HEXDIG HEXDIG
      * reserved      = gen-delims / sub-delims
      * gen-delims    = ":" / "/" / "?" / "#" / "[" / "]" / "@"
      * sub-delims    = "!" / "$" / "&" / "'" / "(" / ")"
      *               / "*" / "+" / "," / ";" / "="
      * unreserved    = ALPHA / DIGIT / "-" / "." / "_" / "~"
      * pchar         = unreserved / pct-encoded / sub-delims / ":" / "@"
      *
      * path          = path-abempty    ; begins with "/" or is empty
      *               / path-absolute   ; begins with "/" but not "//"
      *               / path-noscheme   ; begins with a non-colon segment
      *               / path-rootless   ; begins with a segment
      *               / path-empty      ; zero characters
      *
      * path-abempty  = *( "/" segment )
      * path-absolute = "/" [ segment-nz *( "/" segment ) ]
      * path-noscheme = segment-nz-nc *( "/" segment )
      * path-rootless = segment-nz *( "/" segment )
      * path-empty    = 0
      * segment       = *pchar
      * segment-nz    = 1*pchar
      * segment-nz-nc = 1*( unreserved / pct-encoded / sub-delims / "@" )
      *               ; non-zero-length segment without any colon ":"
      *
      * query         = *( pchar / "/" / "?" )
      *
      * fragment      = *( pchar / "/" / "?" )
      * ```
      *
      *
      * For the hostname component, we are checking for valid DNS hostnames according to RFC 952 / RFC 1123:
      *
      *
      * ```javascript
      *
      * hname         = name *("." name)
      * name          = let-or-digit ( *( let-or-digit-or-hyphen ) let-or-digit )
      * ```
      *
      *
      * When the URI uses the protocol 'mailto:', the address part is additionally checked against the most commonly
      * used parts of RFC 6068:
      *
      *
      * ```javascript
      *
      * mailtoURI     = "mailto:" [ to ] [ hfields ]
      * to            = addr-spec *("," addr-spec )
      * hfields       = "?" hfield *( "&" hfield )
      * hfield        = hfname "=" hfvalue
      * hfname        = *qchar
      * hfvalue       = *qchar
      * addr-spec     = local-part "@" domain
      * local-part    = dot-atom-text              // not accepted: quoted-string
      * domain        = dot-atom-text              // not accepted: "[" *dtext-no-obs "]"
      * dtext-no-obs  = %d33-90 / ; Printable US-ASCII
      *                 %d94-126  ; characters not including
      *                           ; "[", "]", or "\"
      * qchar         = unreserved / pct-encoded / some-delims
      * some-delims   = "!" / "$" / "'" / "(" / ")" / "*"
      *               / "+" / "," / ";" / ":" / "@"
      *
      * Note:
      * A number of characters that can appear in <addr-spec> MUST be
      * percent-encoded.  These are the characters that cannot appear in
      * a URI according to [STD66] as well as "%" (because it is used for
      * percent-encoding) and all the characters in gen-delims except "@"
      * and ":" (i.e., "/", "?", "#", "[", and "]").  Of the characters
      * in sub-delims, at least the following also have to be percent-
      * encoded: "&", ";", and "=".  Care has to be taken both when
      * encoding as well as when decoding to make sure these operations
      * are applied only once.
      *
      * ```
      *
      *
      * When a list of allowed entries has been configured using {@link #add}, any URL that passes the syntactic
      * checks above, additionally will be tested against the content of this list.
      *
      * @returns true if valid, false if not valid
      */
    def validate(/**
      * URL to be validated
      */
    sUrl: String): Boolean = js.native
  }
  
  type _To = URLListValidator
  
  /* This means you don't have to write `default`, but can instead just say `sapBaseSecurityUrllistvalidatorMod.foo` */
  override def _to: URLListValidator = default
}
