package typings.opentelemetryInstrumentationGrpc

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.StringDictionary
import typings.grpc.mod.Deadline
import typings.grpc.mod.Filename
import typings.grpc.mod.GenericClientOptions
import typings.grpc.mod.GoogleOAuth2Client
import typings.grpc.mod.LoadObjectOptions
import typings.grpc.mod.LoadOptions
import typings.grpc.mod.ServiceDefinition
import typings.grpc.mod.logVerbosity
import typings.grpc.mod.metadataGenerator
import typings.grpcGrpcJs.adminMod.GetHandlers
import typings.grpcGrpcJs.adminMod.GetServiceDefinition
import typings.grpcGrpcJs.anon.PartialChannelControlHelp
import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.anon.PartialFailurePercentageE
import typings.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typings.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typings.grpcGrpcJs.callCredentialsMod.OAuth2Client
import typings.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.clientMod.Client
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.durationMod.Duration
import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancerConstructor
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancingConfig
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancingConfigConstructor
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.grpcGrpcJs.makeClientMod.PackageDefinition
import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.mod.CallCredentials
import typings.grpcGrpcJs.mod.ChannelCredentials
import typings.grpcGrpcJs.mod.ServerCredentials
import typings.grpcGrpcJs.mod.experimental.OutlierDetectionLoadBalancingConfig
import typings.grpcGrpcJs.resolverMod.ResolverConstructor
import typings.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typings.grpcGrpcJs.srcServerMod.Server
import typings.grpcGrpcJs.subchannelAddressMod.SubchannelAddress
import typings.grpcGrpcJs.subchannelInterfaceMod.SubchannelInterface
import typings.grpcGrpcJs.uriParserMod.GrpcUri
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzDefinition
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzHandlers
import typings.node.bufferMod.global.Buffer
import typings.node.http2Mod.IncomingHttpHeaders
import typings.node.tlsMod.SecureContext
import typings.opentelemetryInstrumentationGrpc.grpcTypesMod.GrpcStatus
import typings.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcBooleans.`true`
import typings.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcStrings.json
import typings.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcStrings.proto
import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Metadata extends StObject {
    
    var metadata: typings.grpcGrpcJs.mod.Metadata
  }
  object Metadata {
    
    inline def apply(metadata: typings.grpcGrpcJs.mod.Metadata): Metadata = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setMetadata(value: typings.grpcGrpcJs.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var service: String
  }
  object Method {
    
    inline def apply(method: String, service: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalName extends StObject {
    
    var originalName: js.UndefOr[String] = js.undefined
  }
  object OriginalName {
    
    inline def apply(): OriginalName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OriginalName]
    }
    
    extension [Self <: OriginalName](x: Self) {
      
      inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
      
      inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var requestStream: Boolean
    
    var responseStream: Boolean
  }
  object Path {
    
    inline def apply(path: String, requestStream: Boolean, responseStream: Boolean): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], requestStream = requestStream.asInstanceOf[js.Any], responseStream = responseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRequestStream(value: Boolean): Self = StObject.set(x, "requestStream", value.asInstanceOf[js.Any])
      
      inline def setResponseStream(value: Boolean): Self = StObject.set(x, "responseStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var metadata: typings.grpc.mod.Metadata
    
    var request: js.UndefOr[Any] = js.undefined
    
    var status: GrpcStatus
  }
  object Request {
    
    inline def apply(metadata: typings.grpc.mod.Metadata, status: GrpcStatus): Request = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setMetadata(value: typings.grpc.mod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStatus(value: GrpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCallCredentials
    extends StObject
       with Instantiable0[CallCredentials] {
    
    def createEmpty(): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    def createFromGoogleCredential(googleCredentials: OAuth2Client): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  }
  
  @js.native
  trait TypeofChannelCredentials
    extends StObject
       with Instantiable0[ChannelCredentials] {
    
    /**
      * Return a new ChannelCredentials instance with credentials created using
      * the provided secureContext. The resulting instances can be used to
      * construct a Channel that communicates over TLS. gRPC will not override
      * anything in the provided secureContext, so the environment variables
      * GRPC_SSL_CIPHER_SUITES and GRPC_DEFAULT_SSL_ROOTS_FILE_PATH will
      * not be applied.
      * @param secureContext The return value of tls.createSecureContext()
      * @param verifyOptions Additional options to modify certificate verification
      */
    def createFromSecureContext(secureContext: SecureContext): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    def createFromSecureContext(secureContext: SecureContext, verifyOptions: VerifyOptions): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      * @param verifyOptions Additional options to modify certificate verification
      */
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  }
  
  @js.native
  trait TypeofMetadata
    extends StObject
       with Instantiable0[typings.grpcGrpcJs.mod.Metadata] {
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    def fromHttp2Headers(headers: IncomingHttpHeaders): typings.grpcGrpcJs.metadataMod.Metadata = js.native
  }
  
  @js.native
  trait TypeofOutlierDetectionLoa
    extends StObject
       with Instantiable7[
          /* intervalMs */ Double | Null, 
          /* baseEjectionTimeMs */ Double | Null, 
          /* maxEjectionTimeMs */ Double | Null, 
          /* maxEjectionPercent */ Double | Null, 
          /* successRateEjection */ PartialSuccessRateEjectio | Null, 
          /* failurePercentageEjection */ PartialFailurePercentageE | Null, 
          /* childPolicy */ js.Array[LoadBalancingConfig], 
          OutlierDetectionLoadBalancingConfig
        ] {
    
    def createFromJson(obj: Any): typings.grpcGrpcJs.loadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = js.native
  }
  
  @js.native
  trait TypeofServerCredentials
    extends StObject
       with Instantiable0[ServerCredentials] {
    
    def createInsecure(): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  }
  
  @js.native
  trait TypeofServerCredentialsInstantiable
    extends StObject
       with Instantiable0[typings.grpc.mod.ServerCredentials] {
    
    /**
      * Create insecure server credentials
      * @return The ServerCredentials
      */
    def createInsecure(): typings.grpc.mod.ServerCredentials = js.native
    
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[typings.grpc.mod.KeyCertPair]): typings.grpc.mod.ServerCredentials = js.native
    def createSsl(
      rootCerts: Null,
      keyCertPairs: js.Array[typings.grpc.mod.KeyCertPair],
      checkClientCertificate: Boolean
    ): typings.grpc.mod.ServerCredentials = js.native
    /**
      * Create SSL server credentials
      * @param rootCerts Root CA certificates for validating client certificates
      * @param keyCertPairs A list of private key and certificate chain pairs to
      * be used for authenticating the server
      * @param checkClientCertificate Indicates that the server should request
      * and verify the client's certificates.
      * Defaults to `false`.
      * @return The ServerCredentials
      */
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[typings.grpc.mod.KeyCertPair]): typings.grpc.mod.ServerCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      keyCertPairs: js.Array[typings.grpc.mod.KeyCertPair],
      checkClientCertificate: Boolean
    ): typings.grpc.mod.ServerCredentials = js.native
  }
  
  trait Typeofcredentials extends StObject {
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    def combineCallCredentials(
      first: typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
      additional: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.callCredentialsMod.CallCredentials
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    def combineChannelCredentials(
      channelCredentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      callCredentials: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
    
    var createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
    
    var createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
    
    var createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
    
    var createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
    
    var createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
    
    var createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
  }
  object Typeofcredentials {
    
    inline def apply(
      combineCallCredentials: (typings.grpcGrpcJs.callCredentialsMod.CallCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
      combineChannelCredentials: (typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any,
      createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any,
      createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any,
      createFromSecureContext: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any,
      createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any,
      createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
    ): Typeofcredentials = {
      val __obj = js.Dynamic.literal(combineCallCredentials = js.Any.fromFunction2(combineCallCredentials), combineChannelCredentials = js.Any.fromFunction2(combineChannelCredentials), createEmpty = createEmpty.asInstanceOf[js.Any], createFromGoogleCredential = createFromGoogleCredential.asInstanceOf[js.Any], createFromMetadataGenerator = createFromMetadataGenerator.asInstanceOf[js.Any], createFromSecureContext = createFromSecureContext.asInstanceOf[js.Any], createInsecure = createInsecure.asInstanceOf[js.Any], createSsl = createSsl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcredentials]
    }
    
    extension [Self <: Typeofcredentials](x: Self) {
      
      inline def setCombineCallCredentials(
        value: (typings.grpcGrpcJs.callCredentialsMod.CallCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.callCredentialsMod.CallCredentials
      ): Self = StObject.set(x, "combineCallCredentials", js.Any.fromFunction2(value))
      
      inline def setCombineChannelCredentials(
        value: (typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
      ): Self = StObject.set(x, "combineChannelCredentials", js.Any.fromFunction2(value))
      
      inline def setCreateEmpty(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ Any
      ): Self = StObject.set(x, "createEmpty", value.asInstanceOf[js.Any])
      
      inline def setCreateFromGoogleCredential(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ Any
      ): Self = StObject.set(x, "createFromGoogleCredential", value.asInstanceOf[js.Any])
      
      inline def setCreateFromMetadataGenerator(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ Any
      ): Self = StObject.set(x, "createFromMetadataGenerator", value.asInstanceOf[js.Any])
      
      inline def setCreateFromSecureContext(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createFromSecureContext */ Any
      ): Self = StObject.set(x, "createFromSecureContext", value.asInstanceOf[js.Any])
      
      inline def setCreateInsecure(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ Any
      ): Self = StObject.set(x, "createInsecure", value.asInstanceOf[js.Any])
      
      inline def setCreateSsl(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ Any
      ): Self = StObject.set(x, "createSsl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofcredentialsCombineCallCredentials extends StObject {
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials object
      * @param credentials The CallCredentials to compose
      * @return A credentials object that combines all of the input credentials
      */
    def combineCallCredentials(credentials: typings.grpc.mod.CallCredentials*): typings.grpc.mod.CallCredentials = js.native
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a single
      * ChannelCredentials object.
      * @param channelCredential The ChannelCredentials to start with
      * @param credentials The CallCredentials to compose
      * @return A credentials object that combines all of the input credentials
      */
    def combineChannelCredentials(
      channelCredential: typings.grpc.mod.ChannelCredentials,
      credentials: typings.grpc.mod.CallCredentials*
    ): typings.grpc.mod.ChannelCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredential The Google credential object to use
      * @return The resulting credentials object
      */
    def createFromGoogleCredential(googleCredential: GoogleOAuth2Client): typings.grpc.mod.CallCredentials = js.native
    
    /**
      * Create a gRPC credentials object from a metadata generation function. This
      * function gets the service URL and a callback as parameters. The error
      * passed to the callback can optionally have a 'code' value attached to it,
      * which corresponds to a status code that this library uses.
      * @param metadataGenerator The function that generates metadata
      * @return The credentials object
      */
    def createFromMetadataGenerator(metadataGenerator: metadataGenerator): typings.grpc.mod.CallCredentials = js.native
    
    /**
      * Create an insecure credentials object. This is used to create a channel that
      * does not use SSL. This cannot be composed with anything.
      * @return The insecure credentials object
      */
    def createInsecure(): typings.grpc.mod.ChannelCredentials = js.native
    
    /**
      * Create an SSL Credentials object. If using a client-side certificate, both
      * the second and third arguments must be passed.
      * @param rootCerts The root certificate data
      * @param privateKey The client certificate private key, if applicable
      * @param certChain The client certificate cert chain, if applicable
      * @param verifyOptions Additional peer verification options, if desired
      * @return The SSL Credentials object
      */
    def createSsl(): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Unit, certChain: Unit, verifyOptions: typings.grpc.mod.VerifyOptions): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Unit, certChain: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Unit,
      certChain: Buffer,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Buffer,
      certChain: Unit,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Unit, privateKey: Buffer, certChain: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Unit,
      privateKey: Buffer,
      certChain: Buffer,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Unit,
      certChain: Unit,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer, privateKey: Unit, certChain: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Unit,
      certChain: Buffer,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer, privateKey: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Buffer,
      certChain: Unit,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(rootCerts: Buffer, privateKey: Buffer, certChain: Buffer): typings.grpc.mod.ChannelCredentials = js.native
    def createSsl(
      rootCerts: Buffer,
      privateKey: Buffer,
      certChain: Buffer,
      verifyOptions: typings.grpc.mod.VerifyOptions
    ): typings.grpc.mod.ChannelCredentials = js.native
  }
  
  @js.native
  trait Typeofexperimental extends StObject {
    
    var BackoffTimeout: Instantiable1[
        /* callback */ js.Function0[Unit], 
        typings.grpcGrpcJs.mod.experimental.BackoffTimeout
      ] = js.native
    
    var BaseFilter: Instantiable0[typings.grpcGrpcJs.mod.experimental.BaseFilter] = js.native
    
    var BaseSubchannelWrapper: Instantiable1[
        /* child */ SubchannelInterface, 
        typings.grpcGrpcJs.mod.experimental.BaseSubchannelWrapper
      ] = js.native
    
    var ChildLoadBalancerHandler: Instantiable1[
        /* channelControlHelper */ ChannelControlHelper, 
        typings.grpcGrpcJs.mod.experimental.ChildLoadBalancerHandler
      ] = js.native
    
    var FilterStackFactory: Instantiable1[
        /* factories */ js.Array[FilterFactory[Filter]], 
        typings.grpcGrpcJs.mod.experimental.FilterStackFactory
      ] = js.native
    
    var OutlierDetectionLoadBalancingConfig: TypeofOutlierDetectionLoa = js.native
    
    var QueuePicker: Instantiable1[/* loadBalancer */ LoadBalancer, typings.grpcGrpcJs.mod.experimental.QueuePicker] = js.native
    
    var UnavailablePicker: Instantiable0[typings.grpcGrpcJs.mod.experimental.UnavailablePicker] = js.native
    
    def createChildChannelControlHelper(parent: ChannelControlHelper, overrides: PartialChannelControlHelp): ChannelControlHelper = js.native
    
    def durationToMs(duration: Duration): Double = js.native
    
    def getFirstUsableConfig(configs: js.Array[LoadBalancingConfig]): LoadBalancingConfig = js.native
    @JSName("getFirstUsableConfig")
    def getFirstUsableConfig_true(configs: js.Array[LoadBalancingConfig], fallbackTodefault: `true`): LoadBalancingConfig = js.native
    
    def log(severity: LogVerbosity, args: Any*): Unit = js.native
    
    def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = js.native
    
    def registerLoadBalancerType(
      typeName: String,
      loadBalancerType: LoadBalancerConstructor,
      loadBalancingConfigType: LoadBalancingConfigConstructor
    ): Unit = js.native
    
    def registerResolver(scheme: String, resolverClass: ResolverConstructor): Unit = js.native
    
    def subchannelAddressToString(address: SubchannelAddress): String = js.native
    
    def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
    
    def uriToString(uri: GrpcUri): String = js.native
    
    def validateLoadBalancingConfig(obj: Any): LoadBalancingConfig = js.native
  }
  
  @js.native
  trait TypeofgrpcJs extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, 
        /* options */ ChannelOptions, 
        typings.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, 
        typings.grpcGrpcJs.mod.Client
      ] = js.native
    
    var InterceptingCall: Instantiable1[/* nextCall */ InterceptingCallInterface, typings.grpcGrpcJs.mod.InterceptingCall] = js.native
    
    var InterceptorConfigurationError: Instantiable1[/* message */ String, typings.grpcGrpcJs.mod.InterceptorConfigurationError] = js.native
    
    var ListenerBuilder: Instantiable0[typings.grpcGrpcJs.mod.ListenerBuilder] = js.native
    
    var Metadata: TypeofMetadata = js.native
    
    var RequesterBuilder: Instantiable0[typings.grpcGrpcJs.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typings.grpcGrpcJs.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentials = js.native
    
    var StatusBuilder: Instantiable0[typings.grpcGrpcJs.mod.StatusBuilder] = js.native
    
    def addAdminServicesToServer(server: Server): Unit = js.native
    
    def closeClient(client: Client): Unit = js.native
    
    val credentials: Typeofcredentials = js.native
    
    val experimental: Typeofexperimental = js.native
    
    def getChannelzHandlers(): ChannelzHandlers = js.native
    
    def getChannelzServiceDefinition(): ChannelzDefinition = js.native
    
    def getClientChannel(client: Client): Channel = js.native
    
    def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
    
    def loadObject(value: Any, options: Any): scala.Nothing = js.native
    
    def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
    
    def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
    
    def setLogger(logger: PartialConsole): Unit = js.native
    
    def waitForClientReady(client: Client, deadline: js.Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  @js.native
  trait TypeofgrpcTypes extends StObject {
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ typings.grpc.mod.ChannelCredentials, 
        /* options */ StringDictionary[String | Double], 
        typings.grpc.mod.Channel
      ] = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ typings.grpc.mod.ChannelCredentials, 
        typings.grpc.mod.Client
      ] = js.native
    
    var ClientDuplexStream: Instantiable0[typings.grpc.mod.ClientDuplexStream[js.Object, js.Object]] = js.native
    
    var ClientReadableStream: Instantiable0[typings.grpc.mod.ClientReadableStream[js.Object]] = js.native
    
    var ClientUnaryCall: Instantiable0[typings.grpc.mod.ClientUnaryCall] = js.native
    
    var ClientWritableStream: Instantiable0[typings.grpc.mod.ClientWritableStream[js.Object]] = js.native
    
    var InterceptingCall: Instantiable0[typings.grpc.mod.InterceptingCall] = js.native
    
    var ListenerBuilder: Instantiable0[typings.grpc.mod.ListenerBuilder] = js.native
    
    var Metadata: Instantiable0[typings.grpc.mod.Metadata] = js.native
    
    var RequesterBuilder: Instantiable0[typings.grpc.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typings.grpc.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentialsInstantiable = js.native
    
    var ServerDuplexStream: Instantiable0[typings.grpc.mod.ServerDuplexStream[js.Object, js.Object]] = js.native
    
    var ServerReadableStream: Instantiable0[typings.grpc.mod.ServerReadableStream[js.Object]] = js.native
    
    var ServerUnaryCall: Instantiable0[typings.grpc.mod.ServerUnaryCall[js.Object]] = js.native
    
    var ServerWritableStream: Instantiable0[typings.grpc.mod.ServerWritableStream[js.Object, js.Object]] = js.native
    
    var StatusBuilder: Instantiable0[typings.grpc.mod.StatusBuilder] = js.native
    
    def closeClient(clientObj: typings.grpc.mod.Client): Unit = js.native
    
    val credentials: TypeofcredentialsCombineCallCredentials = js.native
    
    def getClientChannel(client: typings.grpc.mod.Client): typings.grpc.mod.Channel = js.native
    
    def load[T](filename: Filename): T = js.native
    def load[T](filename: Filename, format: proto | json): T = js.native
    def load[T](filename: Filename, format: proto | json, options: LoadOptions): T = js.native
    def load[T](filename: Filename, format: Unit, options: LoadOptions): T = js.native
    
    def loadObject[T](value: js.Object): T = js.native
    def loadObject[T](value: js.Object, options: LoadObjectOptions): T = js.native
    
    def loadPackageDefinition(packageDefinition: typings.grpc.mod.PackageDefinition): typings.grpc.mod.GrpcObject = js.native
    
    def makeGenericClientConstructor(methods: ServiceDefinition[Any], serviceName: String, classOptions: GenericClientOptions): Instantiable3[
        /* address */ String, 
        /* credentials */ typings.grpc.mod.ChannelCredentials, 
        /* options */ js.UndefOr[js.Object], 
        typings.grpc.mod.Client
      ] = js.native
    
    def setLogVerbosity(verbosity: logVerbosity): Unit = js.native
    
    def setLogger(logger: Console): Unit = js.native
    
    def waitForClientReady(
      client: typings.grpc.mod.Client,
      deadline: Deadline,
      callback: js.Function1[/* error */ js.Error | Null, Unit]
    ): Unit = js.native
  }
}
