
# Scala.js typings for opentracing

Typings are for version 0.14.4

## Library description:
[![Build Status][ci-img]][ci] [![Coverage Status][cov-img]][cov] [![NPM Published Version][npm-img]][npm] ![Node Version][node-img]

|                    |                 |
| ------------------ | :-------------: |
| Full name          | opentracing |
| Keywords           | - |
| # releases         | 5 |
| # dependents       | 84 |
| # downloads        | 4884881 |
| # stars            | 3 |

## Links
- [Homepage](https://github.com/opentracing/opentracing-javascript#readme)
- [Bugs](https://github.com/opentracing/opentracing-javascript/issues)
- [Repository](https://github.com/opentracing/opentracing-javascript)
- [Npm](https://www.npmjs.com/package/opentracing)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * Convenience class to use as a binary carrier.
 *
 * Any valid Object with a field named `buffer` may be used as a binary carrier;
 * this class is only one such type of object that can be used.
 */
/**
 * The FORMAT_BINARY format represents SpanContexts in an opaque binary
 * carrier.
 *
 * Tracer.inject() will set the buffer field to an Array-like (Array,
 * ArrayBuffer, or TypedBuffer) object containing the injected binary data.
 * Any valid Object can be used as long as the buffer field of the object
 * can be set.
 *
 * Tracer.extract() will look for `carrier.buffer`, and that field is
 * expected to be an Array-like object (Array, ArrayBuffer, or
 * TypedBuffer).
 */
/** SPAN_KIND hints at relationship between spans, e.g. client/server */
/**
 * SpanContext represents Span state that must propagate to descendant Spans
 * and across process boundaries.
 *
 * SpanContext is logically divided into two pieces: the user-level "Baggage"
 * (see setBaggageItem and getBaggageItem) that propagates across Span
 * boundaries and any Tracer-implementation-specific fields that are needed to
 * identify or otherwise contextualize the associated Span instance (e.g., a
 * <trace_id, span_id, sampled> tuple).
 */

```

